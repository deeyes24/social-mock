package com.oracle.ci.twitter_data;

public class Reply extends Tweet {

    public Reply(String text, String authorName, String inreplyToAuthor) {
        super(text, authorName);

        setIn_reply_to_screen_name(inreplyToAuthor);

        setIn_reply_to_user_id_str("" + inreplyToAuthor.hashCode());

        setIn_reply_to_user_id((long) inreplyToAuthor.hashCode());

        setIn_reply_to_status_id_str("" + (inreplyToAuthor + "statusId").hashCode());

        setIn_reply_to_status_id((long) (inreplyToAuthor + "statusId").hashCode());

    }

}
