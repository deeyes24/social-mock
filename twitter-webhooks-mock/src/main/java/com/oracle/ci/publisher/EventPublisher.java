package com.oracle.ci.publisher;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oracle.ci.TwitterWebhooksMockConfiguration;
import com.oracle.ci.client.PublisherClient;
import com.oracle.ci.data_management.EventCreator;
import com.oracle.ci.data_management.Favorite;
import com.oracle.ci.data_management.FollowEvent;
import com.oracle.ci.data_management.FollowingMe;
import com.oracle.ci.data_management.IEventCreator;
import com.oracle.ci.data_management.QuotedRetweet;
import com.oracle.ci.data_management.ReceivedDirectMessage;
import com.oracle.ci.data_management.Reply;
import com.oracle.ci.data_management.Retweet;
import com.oracle.ci.data_management.SendDirectMessage;
import com.oracle.ci.data_management.UserTweet;

public class EventPublisher {
    private static final Logger logger = LoggerFactory.getLogger(EventPublisher.class);

    private TwitterWebhooksMockConfiguration config;
    private PublisherClient client;
    private IEventCreator creator;

    public EventPublisher(TwitterWebhooksMockConfiguration config) {
        this.config = config;
        client = new PublisherClient(config);
        creator = new EventCreator(config);
    }

    public void pushTwitterEvents() {
        String payload = creator.createUserMention();
        pushTwitterEvents(payload);
        logger.info("Published a Twitter UserMention:  " + payload);

        payload = new UserTweet().getUserTweet();
        pushTwitterEvents(payload);

        logger.info("Published a Tweet Event:  " + payload);

        payload = new Retweet().getRetweet();

        pushTwitterEvents(payload);

        logger.info("Published a Retweet Event:" + payload);

        payload = new Favorite().getFavorite();

        pushTwitterEvents(payload);

        logger.info("Published Favorited Event {}", payload);

        payload = new Reply().getReply();

        pushTwitterEvents(payload);

        logger.info("Published Reply Event {}", payload);

        payload = new QuotedRetweet().getQuotedRetweet();

        pushTwitterEvents(payload);

        logger.info("Published QuotedRetweet Event {}", payload);

        payload = new FollowEvent().getFollowEvent();

        pushTwitterEvents(payload);

        logger.info("Published Follow Event {}", payload);

        payload = new SendDirectMessage().getSendDM();

        pushTwitterEvents(payload);

        logger.info("Published Send DM Event {}", payload);

        payload = new FollowingMe().getFollowingMeEvent();

        pushTwitterEvents(payload);

        logger.info("Published FollowMe Event {}", payload);

        payload = new ReceivedDirectMessage().getReceivedDM();

        pushTwitterEvents(payload);

        logger.info("Published Received DM Event {}", payload);

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
