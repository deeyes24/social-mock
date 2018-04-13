package com.oracle.ci.twitter_data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RetweetStatus extends Tweet {

    @JsonProperty
    Tweet retweeted_status;

    public RetweetStatus(String text, String authorName) {
        super(" Retweeted " + text, "Retweeted Author " + authorName);
        retweeted_status = new Tweet(text, authorName);

    }

}
