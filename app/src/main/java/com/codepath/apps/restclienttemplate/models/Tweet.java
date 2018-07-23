package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.jar.JarException;

/**
 * Created by Amanda on 7/22/2018.
 */

public class Tweet {
    public String body;
    public long uid;
    public User user;
    public String createAt;

    public static Tweet fromJSSON(JSONObject jsonObject) throws JSONException{
        Tweet tweet = new Tweet();

        tweet.body = jsonObject.getString("text");
        tweet.uid = jsonObject.getLong("id");
        tweet.createAt = jsonObject.getString("created_at");
        tweet.user = User.fromJSON(jsonObject.getJSONObject("user"));
        return tweet;
    }

}
