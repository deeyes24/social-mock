package com.oracle.ci.client;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.http.HttpHost;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oracle.ci.TwitterWebhooksMockConfiguration;

public class PublisherClient {

    private static final Logger logger = LoggerFactory.getLogger(PublisherClient.class);
    private TwitterWebhooksMockConfiguration config;

    private HttpPost req;

    public PublisherClient(TwitterWebhooksMockConfiguration config) {
        this.config = config;
    }

    public void pushWebhookEvent(String payload) throws ClientProtocolException, IOException, InvalidKeyException,
            IllegalStateException, NoSuchAlgorithmException {
        req = new HttpPost(config.getWebhookUrl());
        RequestConfig.Builder requestConfigBuilder = RequestConfig.custom();
        if (config.isProxyEnabled()) {
            logger.debug("Proxy is Enabled. Configuring with {} host on port {} ", config.getProxyHost(),
                    config.getProxyHostPort());
            requestConfigBuilder.setProxy(new HttpHost(config.getProxyHost(), config.getProxyHostPort()));
        }

        logger.info("Creating Http Request");

        req.setConfig(requestConfigBuilder.build());
        req.setEntity(new StringEntity(payload, "UTF8"));
        req.setHeader("Content-type", "application/json");
        req.setHeader("X-Twitter-Webhooks-Signature", getWebhookSignature(config.getConsumerSecretKey(), payload));

        CloseableHttpClient httpClient = HttpClients.custom().build();
        CloseableHttpResponse response = httpClient.execute(req);

        logger.info("Response Code " + response.getStatusLine().getStatusCode());
    }

    private String getWebhookSignature(String key, String data)
            throws IllegalStateException, UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException {

        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
        sha256_HMAC.init(secret_key);
        Base64.Encoder encoder = Base64.getEncoder();
        String resp = "sha256=" + encoder.encodeToString(sha256_HMAC.doFinal(data.getBytes("UTF-8")));
        return resp;
    }

}
