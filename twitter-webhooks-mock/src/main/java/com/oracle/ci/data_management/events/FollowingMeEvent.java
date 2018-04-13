package com.oracle.ci.data_management.events;

import com.oracle.ci.twitter_data.Follow;

public class FollowingMeEvent {

    public String getFollowingMeEvent() {
        return "{\"follow_events\":[{\"type\":\"follow\",\"created_timestamp\":\"1522392939688\",\"target\":{\"id\":\"804239890980343809\",\"default_profile_image\":false,\"profile_background_image_url\":\"\",\"friends_count\":4,\"favourites_count\":20,\"profile_link_color\":-1,\"profile_background_image_url_https\":\"\",\"utc_offset\":0,\"screen_name\":\"SDPTestAccount1\",\"is_translator\":false,\"followers_count\":6,\"name\":\"SDPTestAccount1\",\"lang\":\"en\",\"profile_use_background_image\":false,\"created_at\":\"Thu Dec 01 08:25:06 +0000 2016\",\"profile_text_color\":-1,\"notifications\":false,\"protected\":false,\"statuses_count\":563,\"url\":\"\",\"contributors_enabled\":false,\"default_profile\":true,\"profile_sidebar_border_color\":-1,\"time_zone\":\"\",\"geo_enabled\":false,\"verified\":false,\"profile_image_url\":\"http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"following\":false,\"profile_image_url_https\":\"https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"profile_background_tile\":false,\"listed_count\":0,\"profile_sidebar_fill_color\":-1,\"location\":\"\",\"follow_request_sent\":false,\"description\":\"\",\"profile_background_color\":-1},\"source\":{\"id\":\"942642023332429824\",\"default_profile_image\":false,\"profile_background_image_url\":\"\",\"friends_count\":73,\"favourites_count\":8,\"profile_link_color\":-1,\"profile_background_image_url_https\":\"\",\"utc_offset\":0,\"screen_name\":\"sdp_sumanth_2\",\"is_translator\":false,\"followers_count\":3,\"name\":\"Sumanth Donthula\",\"lang\":\"en\",\"profile_use_background_image\":false,\"created_at\":\"Mon Dec 18 06:25:46 +0000 2017\",\"profile_text_color\":-1,\"notifications\":false,\"protected\":false,\"statuses_count\":124,\"url\":\"\",\"contributors_enabled\":false,\"default_profile\":true,\"profile_sidebar_border_color\":-1,\"time_zone\":\"\",\"geo_enabled\":false,\"verified\":false,\"profile_image_url\":\"http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"following\":false,\"profile_image_url_https\":\"https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"profile_background_tile\":false,\"listed_count\":0,\"profile_sidebar_fill_color\":-1,\"location\":\"\",\"follow_request_sent\":false,\"description\":\"\",\"profile_background_color\":-1}}]}";
    }

    String header = "follow_events";

    public String getFollowingMeEvent(String followedAuthor, String followingAuthor) {
        return Utils.getObjectAsString(new Follow(followingAuthor, followedAuthor), header);
    }

}
