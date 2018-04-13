package com.oracle.ci.twitter_data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Target {

    @JsonProperty
    Long recipient_id;

    public Long getRecipient_id() {
        return recipient_id;
    }

    public void setRecipient_id(Long recipient_id) {
        this.recipient_id = recipient_id;
    }

    
    
}
