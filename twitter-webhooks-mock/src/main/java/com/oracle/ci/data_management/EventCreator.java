package com.oracle.ci.data_management;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.ci.TwitterWebhooksMockConfiguration;

public class EventCreator implements IEventCreator {

    private TwitterWebhooksMockConfiguration config;

    public EventCreator(TwitterWebhooksMockConfiguration config) {
        this.config = config;
    }

    @Override
    public String createUserMention(String authorName) {
        UserMention um= new UserMention(authorName);
        
        try {
            return new ObjectMapper().writeValueAsString(um.getUM());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return createUserMention("testAuthor");
    }

    @Override
    public String createUserMention() {
        return createUserMention("testAuthor");
    }

}
