package com.oracle.ci.data_management.events;

import com.oracle.ci.twitter_data.Follow;

public class FollowEvent {

    String header = "follow_events";
    public String getFollowEvent() {
      return "{\"follow_events\":[{\"type\":\"follow\",\"created_timestamp\":\"1522392630938\",\"target\":{\"id\":\"149180925\",\"default_profile_image\":false,\"profile_background_image_url\":\"\",\"friends_count\":950,\"favourites_count\":3692,\"profile_link_color\":-1,\"profile_background_image_url_https\":\"\",\"utc_offset\":0,\"screen_name\":\"ThisAmerLife\",\"is_translator\":false,\"followers_count\":438488,\"name\":\"This American Life\",\"lang\":\"en\",\"profile_use_background_image\":false,\"created_at\":\"Fri May 28 16:33:50 +0000 2010\",\"profile_text_color\":-1,\"notifications\":false,\"protected\":false,\"statuses_count\":5885,\"url\":\"http://t.co/10Ic8JwHCQ\",\"contributors_enabled\":false,\"default_profile\":true,\"profile_sidebar_border_color\":-1,\"time_zone\":\"\",\"geo_enabled\":false,\"verified\":true,\"profile_image_url\":\"http://pbs.twimg.com/profile_images/951846376249479169/KoS5xoCW_normal.jpg\",\"following\":false,\"profile_image_url_https\":\"https://pbs.twimg.com/profile_images/951846376249479169/KoS5xoCW_normal.jpg\",\"profile_background_tile\":false,\"listed_count\":6081,\"profile_sidebar_fill_color\":-1,\"location\":\"New York, NY\",\"follow_request_sent\":false,\"description\":\"A weekly public radio show and podcast hosted by @iraglass, and produced in collaboration with @WBEZ.\",\"profile_background_color\":-1},\"source\":{\"id\":\"942642023332429824\",\"default_profile_image\":false,\"profile_background_image_url\":\"\",\"friends_count\":72,\"favourites_count\":8,\"profile_link_color\":-1,\"profile_background_image_url_https\":\"\",\"utc_offset\":0,\"screen_name\":\"sdp_sumanth_2\",\"is_translator\":false,\"followers_count\":3,\"name\":\"Sumanth Donthula\",\"lang\":\"en\",\"profile_use_background_image\":false,\"created_at\":\"Mon Dec 18 06:25:46 +0000 2017\",\"profile_text_color\":-1,\"notifications\":false,\"protected\":false,\"statuses_count\":124,\"url\":\"\",\"contributors_enabled\":false,\"default_profile\":true,\"profile_sidebar_border_color\":-1,\"time_zone\":\"\",\"geo_enabled\":false,\"verified\":false,\"profile_image_url\":\"http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"following\":false,\"profile_image_url_https\":\"https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"profile_background_tile\":false,\"listed_count\":0,\"profile_sidebar_fill_color\":-1,\"location\":\"\",\"follow_request_sent\":false,\"description\":\"\",\"profile_background_color\":-1}}]}";
    }

   
    
    public String getFollowEvent(String followingAuthor, String followedAuthor) {
        return Utils.getObjectAsString(new Follow (followingAuthor,followedAuthor),header);
    }


}