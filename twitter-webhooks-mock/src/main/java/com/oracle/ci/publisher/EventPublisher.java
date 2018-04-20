package com.oracle.ci.publisher;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oracle.ci.TwitterWebhooksMockConfiguration;
import com.oracle.ci.client.PublisherClient;
import com.oracle.ci.data_management.events.DataCreator;
import com.oracle.ci.data_management.events.FollowEvent;
import com.oracle.ci.data_management.events.FollowingMeEvent;
import com.oracle.ci.data_management.events.SendDirectMessageEvent;

public class EventPublisher {
    private static final Logger logger = LoggerFactory.getLogger(EventPublisher.class);

    private TwitterWebhooksMockConfiguration config;
    private PublisherClient client;

    public EventPublisher(TwitterWebhooksMockConfiguration config) {
        this.config = config;
        client = new PublisherClient(config);

    }

    public void pushTwitterEvents() {

        DataCreator dCreator= new DataCreator();
        
        String payload;
        

        payload = dCreator.getUserTweet("New Tweet " + System.currentTimeMillis(), "TestAuthor");
        pushTwitterEvents(payload);
        logger.info("Published a Tweet Event:  " + payload);

        
        payload = dCreator.getRetweet("New Reweet Event " + System.currentTimeMillis(), "TestAuthor");

        pushTwitterEvents(payload);

        logger.info("Published a Retweet Event:" + payload);
        
        
        payload = dCreator.getFavorite("Existing Tweet Event" + System.currentTimeMillis(),
                "Original AUthor", "Favorited Author");

        pushTwitterEvents(payload);

        logger.info("Published Favorited Event {}", payload);

        payload = dCreator.getReply("Original Tweet Text" + System.currentTimeMillis(), "Tweeting AUthor",
                "Original Author");

        pushTwitterEvents(payload);

        logger.info("Published Reply Event {}", payload);

        payload = dCreator.getQuotedRetweet("Quoted Retweet ","Original Author");

        pushTwitterEvents(payload);

        logger.info("Published QuotedRetweet Event {}", payload);

        payload = dCreator.getFollowEvent("FollowingAuthor", "FollowedAuthor");

        pushTwitterEvents(payload);

        logger.info("Published Follow Event {}", payload);
        
        payload = dCreator.getFollowEvent("FollowedAuthor","FollowingAuthor");

        pushTwitterEvents(payload);

        logger.info("Published FollowMe Event {}", payload);

        payload = dCreator.getSendDM("SenderAuthor","ReceivedAuthor","DirectMessageText");
        pushTwitterEvents(payload);
        logger.info("Published Send DM Event {}", payload);



    }

    public void pushTwitterEvents(String payload) {
        try {
            client.pushWebhookEvent(payload);
        } catch (IOException | InvalidKeyException | IllegalStateException | NoSuchAlgorithmException e) {
            logger.info("Caught Exception while trying to publish to webhook URL ");
            e.printStackTrace();
        }

    }

}
