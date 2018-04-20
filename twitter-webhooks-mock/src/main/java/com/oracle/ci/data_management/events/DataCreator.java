package com.oracle.ci.data_management.events;

import com.oracle.ci.twitter_data.DirectMessage;
import com.oracle.ci.twitter_data.Favorite;
import com.oracle.ci.twitter_data.Follow;
import com.oracle.ci.twitter_data.QuotedRetweet;
import com.oracle.ci.twitter_data.Reply;
import com.oracle.ci.twitter_data.RetweetStatus;
import com.oracle.ci.twitter_data.Tweet;

public class DataCreator  {

    String header;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }
    
    
    public String getFavorite(String text, String originalAuthor, String favoritedAuthor) {
        header = "favorite_events";
        Favorite fav = new Favorite(new Tweet(text,originalAuthor),favoritedAuthor);
        return Utils.getObjectAsString(fav, header);
    }
    
    public String getUserTweet(String tweetText, String author) {
        header = "tweet_create_events";
        Tweet tweet = new Tweet(tweetText, author);
        return Utils.getObjectAsString(tweet,header);

    }


    public String getRetweet(String text, String authorName) {
        header= "tweet_create_events";
        RetweetStatus retweet = new RetweetStatus(text, authorName);
        return Utils.getObjectAsString(retweet,header);
    }
    
    public String getReply(String text, String tweetAuthor, String originalAuthor) {
        header = "tweet_create_events";
        return Utils.getObjectAsString(new Reply(text, tweetAuthor, originalAuthor), header);
    }

    public String getQuotedRetweet(String text, String author) {
        header ="tweet_create_events";
        return Utils.getObjectAsString(new QuotedRetweet (text,author),header);
    }
    
    public String getSendDM(String sender, String receiver, String text) {
        DirectMessage dm = new DirectMessage(sender,receiver,text);
        return Utils.getObjectAsString(dm, "direct_message_events");
    }
    
    
    public String getFollowEvent(String followingAuthor, String followedAuthor) {
        header = "follow_events";
        return Utils.getObjectAsString(new Follow (followingAuthor,followedAuthor),header);
    }

 
    public String getFollowingMeEvent(String followedAuthor, String followingAuthor) {
        header = "follow_events";
        return Utils.getObjectAsString(new Follow(followingAuthor, followedAuthor), header);
    }

}
