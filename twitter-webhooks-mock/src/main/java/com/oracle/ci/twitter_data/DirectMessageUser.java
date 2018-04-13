package com.oracle.ci.twitter_data;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DirectMessageUser{


    @JsonProperty
    Long id;

    @JsonProperty
    Long created_timestamp =  System.currentTimeMillis() - 1000000;

    @JsonProperty
    String name;

    @JsonProperty
    String screen_name;

    @JsonProperty
    Boolean Protected = false;
    @JsonProperty
    Boolean verified = false;
    @JsonProperty
    Integer followers_count = 3;
    @JsonProperty
    Integer friends_count = 71;
    
    @JsonProperty
    Integer statuses_count = 124;
    
    @JsonProperty
    String url;
    @JsonProperty
    String description = "Twitter Test User";
    @JsonProperty
    String translator_type = "none";
   
  
    
    @JsonProperty
    Integer listed_count = 0;
    @JsonProperty
    Integer favourites_count = 8;
  
    @JsonProperty
    String profile_image_url = "http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png";
    @JsonProperty
    String profile_image_url_https = "https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png";
    
    
    DirectMessageUser(String name){
        this.name=name;
        this.screen_name=name;
        this.id=(long) name.hashCode();
    }
    
   

}
