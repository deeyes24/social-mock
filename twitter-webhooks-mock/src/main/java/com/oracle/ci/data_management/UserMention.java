package com.oracle.ci.data_management;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class UserMention {

    String created_at;
    long id;
    String id_str;
    String text;
    String in_reply_to_user_id_str;
    String in_reply_to_screen_name;
    Map<String, Object> user;
    String lang;

    public UserMention(String authorName) {

        created_at = getCreatedAt();
        id = System.currentTimeMillis();
        id_str = "" + id;
        text = "@" + authorName + " This is a user Mention posted with id " + id;
        in_reply_to_user_id_str = "" + (System.currentTimeMillis() - authorName.hashCode());
        in_reply_to_screen_name = authorName;
        user = getUserFor(authorName);

        lang = "en";

    }

    public Map<String, Object> getUM() {
        Map<String, Object> um = new HashMap<String, Object>();
        um.put("created_at", created_at);
        um.put("id", id);
        um.put("id_str", id_str);
        um.put("text", text);
        um.put("in_reply_to_user_id_str", in_reply_to_user_id_str);
        um.put("in_reply_to_screen_name", in_reply_to_screen_name);
        um.put("user", user);
        um.put("lang", lang);

        return um;
    }

    private Map<String, Object> getUserFor(String authorName) {
        Map<String, Object> authorInfo = new HashMap<String, Object>();
        authorInfo.put("id", System.currentTimeMillis() - authorName.hashCode());
        authorInfo.put("id_str", "" + (System.currentTimeMillis() - authorName.hashCode()));
        authorInfo.put("name", authorName);
        authorInfo.put("screen_name", authorName);
        authorInfo.put("created_at", "Thu Dec 01 08:25:06 +0000 2016");
        return authorInfo;

    }

    private String getCreatedAt() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM d HH:mm:ss Z yyyy");
        String strDate = formatter.format(date);
        return strDate;
    }

}
