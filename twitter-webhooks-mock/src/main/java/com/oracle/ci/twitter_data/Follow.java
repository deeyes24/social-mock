package com.oracle.ci.twitter_data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Follow {

  @JsonProperty
  String type="follow";
  
  @JsonProperty
  Long created_timestamp = System.currentTimeMillis();
  
  
  @JsonProperty
  TweetAuthor target;
  
  @JsonProperty
  TweetAuthor source;
  
  public Follow(String targetAuthor,String sourceAuthor){
      target = new TweetAuthor(targetAuthor) ;
      source = new TweetAuthor(sourceAuthor);
  }


}
