package com.oracle.ci.twitter_data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageCreate {

    @JsonProperty
    Target target;
    @JsonProperty
    Long sender_id;

    @JsonProperty
    MessageData message_data;

    MessageCreate(String senderId, String receiverId, String text) {
        target = new Target();
        target.setRecipient_id((long) receiverId.hashCode());
        sender_id = (long) senderId.hashCode();
        message_data = new MessageData(text);
    }

}
