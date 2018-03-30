package com.oracle.ci;

import java.net.URI;
import java.time.Duration;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.dropwizard.Configuration;

public class TwitterWebhooksMockConfiguration extends Configuration {

    /**
     * Represents the WebhookUrl Endpoint which needs to be tested
     */

    @JsonProperty
    @NotNull
    private String webhookUrl;

    /**
     * Represents the Proxy that is needed to connect to the WebhookUrl
     */
    @JsonProperty
    private String proxyUrl;

    /**
     * Sleep Interval between successive publishing of Twitter Events to the
     * Webhook Url
     */
    @JsonProperty
    private Duration publishSleepTime = Duration.ofMinutes(1);

    /**
     * Represents the App's ConsumerKey. Need not be an actual value
     */
    @JsonProperty
    private String consumerKey;

    /**
     * Represents the consumerSecretKey. This is used for authorizing incoming
     * events.
     */
    @JsonProperty
    private String consumerSecretKey;

    @JsonProperty
    private Boolean scheduledPublishing = true;
    
    

    public String getWebhookUrl() {
        return webhookUrl;
    }

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public String getProxyUrl() {
        return proxyUrl;
    }

    public void setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
    }

    public Duration getPublishSleepTime() {
        return publishSleepTime;
    }

    public void setPublishSleepTime(Duration publishSleepTime) {
        this.publishSleepTime = publishSleepTime;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecretKey() {
        return consumerSecretKey;
    }

    public void setConsumerSecretKey(String consumerSecretKey) {
        this.consumerSecretKey = consumerSecretKey;
    }

    public String getProxyHost() {
        URI proxyURI = URI.create(proxyUrl);
        return proxyURI.getHost();
    }

    public int getProxyHostPort() {
        URI proxyURI = URI.create(proxyUrl);
        return proxyURI.getPort();
    }

    public boolean isProxyEnabled() {
        return null != proxyUrl;
    }

    public boolean isSchedulerEnabled() {
        return scheduledPublishing;
    }

}
