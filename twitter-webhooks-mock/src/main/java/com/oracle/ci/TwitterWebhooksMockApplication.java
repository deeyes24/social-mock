package com.oracle.ci;

import com.oracle.ci.health.AppHealthCheck;
import com.oracle.ci.resources.PublishTwitterEventsResource;
import com.oracle.ci.scheduled.ManagedPeriodicTask;
import com.oracle.ci.scheduled.PublishEventsScheduledTask;

import io.dropwizard.Application;
import io.dropwizard.lifecycle.Managed;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TwitterWebhooksMockApplication extends Application<TwitterWebhooksMockConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TwitterWebhooksMockApplication().run(args);
    }

    @Override
    public String getName() {
        return "TwitterWebhooksMock";
    }

    @Override
    public void initialize(final Bootstrap<TwitterWebhooksMockConfiguration> bootstrap) {

    }

    @Override
    public void run(final TwitterWebhooksMockConfiguration c, final Environment e) {
        
        /**
         * Exposing an End Point for Manual Publishing of Twitter Events 
         */
        e.jersey().register(new PublishTwitterEventsResource(c));

        /**
         * A Scheduled task that publishes Twitter Events as per the schedule 
         */
        if(c.isSchedulerEnabled()) {
        final PublishEventsScheduledTask periodicTask =  new PublishEventsScheduledTask(c) ;
        final Managed managedImplementer = new ManagedPeriodicTask(periodicTask);
        e.lifecycle().manage(managedImplementer);
        }
        
        
        /**
         * Register HealthChecks
         */
        e.healthChecks().register("APIHealthCheck", new AppHealthCheck());
    }

}
