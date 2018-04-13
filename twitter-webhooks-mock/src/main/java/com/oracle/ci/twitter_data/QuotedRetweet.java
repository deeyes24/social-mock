package com.oracle.ci.twitter_data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuotedRetweet extends Tweet{

    @JsonProperty
    QuotedTweet quoted_status;
    
    @JsonProperty
    Long quoted_status_id;
    
    @JsonProperty
    String quoted_status_id_str;
    
    @JsonProperty
    Boolean is_quoted_status;

    
    public QuotedRetweet(String text, String authorName) {
        super(text, authorName);
        quoted_status = new QuotedTweet(text+"quoted text ",authorName+ " quoted Author");
        
        quoted_status_id = quoted_status.getId();
        quoted_status_id_str = quoted_status.getId_str();
    }
    
    
    
    
    

}
