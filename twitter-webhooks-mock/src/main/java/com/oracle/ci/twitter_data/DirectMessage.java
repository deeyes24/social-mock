package com.oracle.ci.twitter_data;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.oracle.ci.data_management.events.Utils;

public class DirectMessage {
    @JsonProperty
    String type = "message_create";
    @JsonProperty
    String created_timestamp = Utils.getCurrentTimeStamp();

    @JsonProperty
    Long id;

    @JsonProperty
    MessageCreate message_create;

    @JsonProperty
    Map<Integer, DirectMessageUser> users = new HashMap<Integer, DirectMessageUser>();

    public DirectMessage(String senderName, String receiverName, String message) {
        id = System.currentTimeMillis();
        message_create = new MessageCreate(senderName, receiverName, message);
        
        users.put(senderName.hashCode(), new DirectMessageUser(senderName));
        users.put(receiverName.hashCode(), new DirectMessageUser(receiverName));

    }

}
