package com.oracle.ci.twitter_data;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.oracle.ci.data_management.events.Utils;

public class Tweet {

    @JsonProperty
    String created_at = Utils.getCurrentTimeStamp();

    @JsonProperty
    Long id;

    @JsonProperty
    String id_str;

    @JsonProperty
    String text;

    @JsonProperty
    Long in_reply_to_status_id;

    @JsonProperty
    String in_reply_to_status_id_str;

    @JsonProperty
    Long in_reply_to_user_id;

    @JsonProperty
    String in_reply_to_user_id_str;

    @JsonProperty
    String in_reply_to_screen_name;

    @JsonProperty
    TweetAuthor user;

    @JsonProperty
    String geo;

    @JsonProperty
    String coordinates;

    @JsonProperty
    Boolean is_quote_status;

    @JsonProperty
    Integer quote_count;

    @JsonProperty
    Integer reply_count;

    @JsonProperty
    Integer retweet_count;

    @JsonProperty
    Integer favorite_count;

    @JsonProperty
    List<Entity> entities = new ArrayList<Entity>();

    @JsonProperty
    Boolean favorited;

    @JsonProperty
    Boolean retweeted;

    @JsonProperty
    Boolean possibly_sensitive;

    @JsonProperty
    String filter_level = "low";

    @JsonProperty
    String lang = "en";

    @JsonProperty
    Long timestamp_ms = System.currentTimeMillis();

    public Tweet(String text, String authorName) {
        this.id = Long.MAX_VALUE- text.hashCode();
        this.id_str = "" + id;
        this.text = text;
        this.user = new TweetAuthor(authorName);

    }

    public Long getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    public void setIn_reply_to_status_id(Long in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    public String getIn_reply_to_status_id_str() {
        return in_reply_to_status_id_str;
    }

    public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
        this.in_reply_to_status_id_str = in_reply_to_status_id_str;
    }

    public Long getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    public void setIn_reply_to_user_id(Long in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    public String getIn_reply_to_user_id_str() {
        return in_reply_to_user_id_str;
    }

    public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
        this.in_reply_to_user_id_str = in_reply_to_user_id_str;
    }

    public String getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getId_str() {
        return id_str;
    }

    public void setId_str(String id_str) {
        this.id_str = id_str;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public TweetAuthor getUser() {
        return user;
    }

    public void setUser(TweetAuthor user) {
        this.user = user;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Boolean getIs_quote_status() {
        return is_quote_status;
    }

    public void setIs_quote_status(Boolean is_quote_status) {
        this.is_quote_status = is_quote_status;
    }

    public Integer getQuote_count() {
        return quote_count;
    }

    public void setQuote_count(Integer quote_count) {
        this.quote_count = quote_count;
    }

    public Integer getReply_count() {
        return reply_count;
    }

    public void setReply_count(Integer reply_count) {
        this.reply_count = reply_count;
    }

    public Integer getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(Integer retweet_count) {
        this.retweet_count = retweet_count;
    }

    public Integer getFavorite_count() {
        return favorite_count;
    }

    public void setFavorite_count(Integer favorite_count) {
        this.favorite_count = favorite_count;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public Boolean getFavorited() {
        return favorited;
    }

    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    public Boolean getRetweeted() {
        return retweeted;
    }

    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    public Boolean getPossibly_sensitive() {
        return possibly_sensitive;
    }

    public void setPossibly_sensitive(Boolean possibly_sensitive) {
        this.possibly_sensitive = possibly_sensitive;
    }

    public String getFilter_level() {
        return filter_level;
    }

    public void setFilter_level(String filter_level) {
        this.filter_level = filter_level;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Long getTimestamp_ms() {
        return timestamp_ms;
    }

    public void setTimestamp_ms(Long timestamp_ms) {
        this.timestamp_ms = timestamp_ms;
    }
    
    
    

}
