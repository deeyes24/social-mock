package com.oracle.ci.scheduled;

import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.AbstractScheduledService;
import com.oracle.ci.TwitterWebhooksMockConfiguration;
import com.oracle.ci.publisher.EventPublisher;


public class PublishEventsScheduledTask extends AbstractScheduledService {

    private TwitterWebhooksMockConfiguration config;


    public PublishEventsScheduledTask(TwitterWebhooksMockConfiguration c) {
        this.config = c;
    }

  
    @Override
    protected void runOneIteration() {
        EventPublisher publisher  = new EventPublisher(config);
        publisher.pushTwitterEvents();  
    }


    @Override
    protected Scheduler scheduler() {
        return AbstractScheduledService.Scheduler.newFixedRateSchedule(0, config.getPublishSleepTime().getSeconds(), TimeUnit.SECONDS);
    }
    
    
}
