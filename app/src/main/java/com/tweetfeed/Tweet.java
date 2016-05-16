package com.tweetfeed;

/**
 * Created by user
 * Date: 5/16/2016
 * DalSAFE
 */
public class Tweet {
    
    public String username;
    public String message;
    public String image_url;

    public Tweet(String username, String message, String url) {
        this.username = username;
        this.message = message;
        this.image_url = url;
    }
}
