package com.oracle.ci.twitter_data;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TweetAuthor {

    @JsonProperty
    Long id;

    @JsonProperty
    String id_str;

    @JsonProperty
    String name;

    @JsonProperty
    String screen_name;

    @JsonProperty
    String url;
    @JsonProperty
    String description = "Twitter Test User";
    @JsonProperty
    String translator_type = "none";
    @JsonProperty
    Boolean Protected = false;
    @JsonProperty
    Boolean verified = false;
    @JsonProperty
    Integer followers_count = 3;
    @JsonProperty
    Integer friends_count = 71;
    @JsonProperty
    Integer listed_count = 0;
    @JsonProperty
    Integer favourites_count = 8;
    @JsonProperty
    Integer statuses_count = 124;
    @JsonProperty
    String created_at = getCreatedAt();
    @JsonProperty
    Long utc_offset = -25200L;
    @JsonProperty
    String time_zone = "Pacific Time (US & Canada)";

    @JsonProperty
    Boolean geo_enabled = false;
    @JsonProperty
    String lang = "en";
    @JsonProperty
    Boolean contributors_enabled = false;
    @JsonProperty
    Boolean is_translator = false;
    @JsonProperty
    String profile_background_color = "F5F8FA";
    @JsonProperty
    String profile_background_image_url = null;
    @JsonProperty
    String profile_background_image_url_https = null;
    @JsonProperty
    Boolean profile_background_tile = false;
    @JsonProperty
    String profile_link_color = "1DA1F2";
    @JsonProperty
    String profile_sidebar_border_color = "C0DEED";
    @JsonProperty
    String profile_sidebar_fill_color = "DDEEF6";
    @JsonProperty
    String profile_text_color = "333333";
    @JsonProperty
    Boolean profile_use_background_image = true;
    @JsonProperty
    String profile_image_url = "http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png";
    @JsonProperty
    String profile_image_url_https = "https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png";
    @JsonProperty
    Boolean default_profile = true;
    @JsonProperty
    Boolean default_profile_image = false;
    @JsonProperty
    String following = null;
    @JsonProperty
    String follow_request_sent = null;
    @JsonProperty
    String notifications = null;

    private String getCreatedAt() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM d HH:mm:ss Z yyyy");
        long authorCreatedAt = System.currentTimeMillis() - 1000000;
        return sdf.format(new Date(authorCreatedAt));
    }

    public TweetAuthor(String name) {
        this.name = name;
        this.screen_name = name;
        this.id = (long) name.hashCode();
        this.id_str = "" + id;

    }

}
