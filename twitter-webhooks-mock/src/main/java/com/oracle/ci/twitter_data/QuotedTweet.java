package com.oracle.ci.twitter_data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuotedTweet extends Tweet {

    @JsonProperty
    Tweet quoted_status;

    public QuotedTweet(String text, String authorName) {
        super(" QuotedTweet " + text, "QUotedAuthor " + authorName);
        quoted_status = new Tweet(text,authorName) ;
    }

}
