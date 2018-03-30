package com.oracle.ci.resources;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;

import com.oracle.ci.TwitterWebhooksMockConfiguration;
import com.oracle.ci.publisher.EventPublisher;

@Path("/mock/webhooks")
@Produces(MediaType.APPLICATION_JSON)
public class PublishTwitterEventsResource {

    private TwitterWebhooksMockConfiguration config;

    public PublishTwitterEventsResource(TwitterWebhooksMockConfiguration c) {
        this.config = c;
    }

    @POST
    @Path("/push")
    public Response execute(String payload) throws Exception {
        if (StringUtils.isNotBlank(payload)) {
            EventPublisher publisher = new EventPublisher(config);
            publisher.pushTwitterEvents(payload);
        } else {
            EventPublisher publisher = new EventPublisher(config);
            publisher.pushTwitterEvents();
        }

        return Response.ok().build();
    }

}
