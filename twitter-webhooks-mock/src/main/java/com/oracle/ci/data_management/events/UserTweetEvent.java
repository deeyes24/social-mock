package com.oracle.ci.data_management.events;

import com.oracle.ci.twitter_data.Tweet;

public class UserTweetEvent {

    
    String header = "tweet_create_events";
//    public String getUserTweet() {
//        return "{\"tweet_create_events\":[{\"created_at\":\"Thu Mar 29 11:21:12 +0000 2018\",\"id\":979317545927954400,\"id_str\":\"979317545927954442\",\"text\":\"Hey @sdp_sumanth_2\",\"source\":\"<a href=\\\"http://twitter.com\\\" rel=\\\"nofollow\\\">Twitter Web Client</a>\",\"truncated\":false,\"in_reply_to_status_id\":null,\"in_reply_to_status_id_str\":null,\"in_reply_to_user_id\":null,\"in_reply_to_user_id_str\":null,\"in_reply_to_screen_name\":null,\"user\":{\"id\":804239890980343800,\"id_str\":\"804239890980343809\",\"name\":\"SDPTestAccount1\",\"screen_name\":\"SDPTestAccount1\",\"location\":null,\"url\":null,\"description\":null,\"translator_type\":\"none\",\"protected\":false,\"verified\":false,\"followers_count\":5,\"friends_count\":4,\"listed_count\":0,\"favourites_count\":20,\"statuses_count\":561,\"created_at\":\"Thu Dec 01 08:25:06 +0000 2016\",\"utc_offset\":null,\"time_zone\":null,\"geo_enabled\":true,\"lang\":\"en\",\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"F5F8FA\",\"profile_background_image_url\":\"\",\"profile_background_image_url_https\":\"\",\"profile_background_tile\":false,\"profile_link_color\":\"1DA1F2\",\"profile_sidebar_border_color\":\"C0DEED\",\"profile_sidebar_fill_color\":\"DDEEF6\",\"profile_text_color\":\"333333\",\"profile_use_background_image\":true,\"profile_image_url\":\"http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"profile_image_url_https\":\"https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"default_profile\":true,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null},\"geo\":null,\"coordinates\":null,\"place\":{\"id\":\"1b8680cd52a711cb\",\"url\":\"https://api.twitter.com/1.1/geo/id/1b8680cd52a711cb.json\",\"place_type\":\"city\",\"name\":\"Bengaluru\",\"full_name\":\"Bengaluru, India\",\"country_code\":\"IN\",\"country\":\"India\",\"bounding_box\":{\"type\":\"Polygon\",\"coordinates\":[[[77.373474,12.919037],[77.373474,13.231381],[77.739371,13.231381],[77.739371,12.919037]]]},\"attributes\":{}},\"contributors\":null,\"is_quote_status\":false,\"quote_count\":0,\"reply_count\":0,\"retweet_count\":0,\"favorite_count\":0,\"entities\":{\"hashtags\":[],\"urls\":[],\"user_mentions\":[{\"screen_name\":\"sdp_sumanth_2\",\"name\":\"Sumanth Donthula\",\"id\":942642023332429800,\"id_str\":\"942642023332429824\",\"indices\":[4,18]}],\"symbols\":[]},\"favorited\":false,\"retweeted\":false,\"filter_level\":\"low\",\"lang\":\"und\",\"timestamp_ms\":\"1522322472446\"}]}";
//    }

    public String getUserTweet(String tweetText, String author) {
        Tweet tweet = new Tweet(tweetText, author);
        return Utils.getObjectAsString(tweet,header);

    }

}
