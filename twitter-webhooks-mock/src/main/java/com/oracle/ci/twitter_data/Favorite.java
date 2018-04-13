package com.oracle.ci.twitter_data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.oracle.ci.data_management.events.Utils;

public class Favorite {

    public Favorite(Tweet tweet, String favoritedAuthor) {
        favorited_status = tweet;
        user = new TweetAuthor(favoritedAuthor);
    }

    @JsonProperty
    String id;

    @JsonProperty
    String created_at = Utils.getCurrentTimeStamp();

    @JsonProperty
    long timestamp_ms = System.currentTimeMillis();

    @JsonProperty
    Tweet favorited_status;

    @JsonProperty
    TweetAuthor user;

}
