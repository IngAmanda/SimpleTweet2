package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Amanda on 7/22/2018.
 */

public class User {

    // list attributes
    public String name;
    public long uid;
    public String screenMame;
    public String profileImageUrl;

    // deserializable the JSON
    public static User fromJSON(JSONObject json) throws JSONException{
        User user = new User();

        // extract and fill the value
        user.name = json.getString("name");
        user.uid = json.getLong("id");
        user.screenMame = json.getString("screen_name");
        user.profileImageUrl = json.getString("profile_image_url");

        return user;
    }
}
