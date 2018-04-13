package com.oracle.ci.data_management.events;

import com.oracle.ci.twitter_data.Reply;

public class ReplyEvent {

    String header = "tweet_create_events";

    public String getReply() {
        return "{\"tweet_create_events\":[{\"created_at\":\"Fri Mar 30 06:44:59 +0000 2018\",\"id\":979610423782789100,\"id_str\":\"979610423782789122\",\"text\":\"@RahulGandhi Cool\",\"display_text_range\":[13,17],\"source\":\"<a href=\\\"http://twitter.com\\\" rel=\\\"nofollow\\\">Twitter Web Client</a>\",\"truncated\":false,\"in_reply_to_status_id\":979562164775088100,\"in_reply_to_status_id_str\":\"979562164775088128\",\"in_reply_to_user_id\":3171712086,\"in_reply_to_user_id_str\":\"3171712086\",\"in_reply_to_screen_name\":\"RahulGandhi\",\"user\":{\"id\":942642023332429800,\"id_str\":\"942642023332429824\",\"name\":\"Sumanth Donthula\",\"screen_name\":\"sdp_sumanth_2\",\"location\":null,\"url\":null,\"description\":null,\"translator_type\":\"none\",\"protected\":false,\"verified\":false,\"followers_count\":3,\"friends_count\":71,\"listed_count\":0,\"favourites_count\":8,\"statuses_count\":122,\"created_at\":\"Mon Dec 18 06:25:46 +0000 2017\",\"utc_offset\":-25200,\"time_zone\":\"Pacific Time (US & Canada)\",\"geo_enabled\":false,\"lang\":\"en\",\"contributors_enabled\":false,\"is_translator\":false,\"profile_background_color\":\"F5F8FA\",\"profile_background_image_url\":\"\",\"profile_background_image_url_https\":\"\",\"profile_background_tile\":false,\"profile_link_color\":\"1DA1F2\",\"profile_sidebar_border_color\":\"C0DEED\",\"profile_sidebar_fill_color\":\"DDEEF6\",\"profile_text_color\":\"333333\",\"profile_use_background_image\":true,\"profile_image_url\":\"http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"profile_image_url_https\":\"https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"default_profile\":true,\"default_profile_image\":false,\"following\":null,\"follow_request_sent\":null,\"notifications\":null},\"geo\":null,\"coordinates\":null,\"place\":null,\"contributors\":null,\"is_quote_status\":false,\"quote_count\":0,\"reply_count\":0,\"retweet_count\":0,\"favorite_count\":0,\"entities\":{\"hashtags\":[],\"urls\":[],\"user_mentions\":[{\"screen_name\":\"RahulGandhi\",\"name\":\"Rahul Gandhi\",\"id\":3171712086,\"id_str\":\"3171712086\",\"indices\":[0,12]}],\"symbols\":[]},\"favorited\":false,\"retweeted\":false,\"filter_level\":\"low\",\"lang\":\"en\",\"timestamp_ms\":\"1522392299968\"}]}";
    }

    public String getReply(String text, String tweetAuthor, String originalAuthor) {

        return Utils.getObjectAsString(new Reply(text, tweetAuthor, originalAuthor), header);
    }

}
