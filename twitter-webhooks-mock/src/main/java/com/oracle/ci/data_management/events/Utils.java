/**
 * 
 */
package com.oracle.ci.data_management.events;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.ci.twitter_data.Tweet;

/**
 * @author deeyes
 *
 */
public class Utils {

    static ObjectMapper mapper = new ObjectMapper();

    public static String getObjectAsString(Tweet tweet) {
        try {
            return mapper.writeValueAsString(tweet);
        } catch (JsonProcessingException e) {

            e.printStackTrace();
        }
        return "";
    }

    public static String getObjectAsString(Object activity, String header) {
        Map<String, Object> response = new HashMap<String, Object>();
        response.put(header, Arrays.asList(activity));
        try {
            return mapper.writeValueAsString(response);
        } catch (JsonProcessingException e) {

            e.printStackTrace();
        }
        return "";
    }

    // Utils
    public static String getCurrentTimeStamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM d HH:mm:ss Z yyyy");
        return sdf.format(new Date());

    }

}
