package com.oracle.ci.data_management.events;

public class ReceivedDirectMessageEvent {

    public String getReceivedDM() {
        return "{\"direct_message_events\":[{\"type\":\"message_create\",\"id\":\"979613569338748932\",\"created_timestamp\":\"1522393049927\",\"message_create\":{\"target\":{\"recipient_id\":\"942642023332429824\"},\"sender_id\":\"804239890980343809\",\"message_data\":{\"text\":\"Hey\",\"entities\":{\"hashtags\":[],\"symbols\":[],\"user_mentions\":[],\"urls\":[]}}}}],\"users\":{\"804239890980343809\":{\"id\":\"804239890980343809\",\"created_timestamp\":\"1480580706875\",\"name\":\"SDPTestAccount1\",\"screen_name\":\"SDPTestAccount1\",\"protected\":false,\"verified\":false,\"followers_count\":6,\"friends_count\":4,\"statuses_count\":563,\"profile_image_url\":\"http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"profile_image_url_https\":\"https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\"},\"942642023332429824\":{\"id\":\"942642023332429824\",\"created_timestamp\":\"1513578346621\",\"name\":\"Sumanth Donthula\",\"screen_name\":\"sdp_sumanth_2\",\"protected\":false,\"verified\":false,\"followers_count\":3,\"friends_count\":73,\"statuses_count\":124,\"profile_image_url\":\"http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"profile_image_url_https\":\"https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\"}}}";
    }

}
