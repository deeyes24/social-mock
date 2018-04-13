package com.oracle.ci.twitter_data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageData {

    
    @JsonProperty
    String text;
    
    @JsonProperty
    List<Entity> entities;

    MessageData(String text){
        this.text = text;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }
    
    
    
}
