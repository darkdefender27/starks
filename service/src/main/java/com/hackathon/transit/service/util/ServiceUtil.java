package com.hackathon.transit.service.util;

import com.google.gson.Gson;

/**
 * Created by SAWAI on 7/9/2016.
 */
public class ServiceUtil {

    public static String toJson(Object o) {
        Gson gson = new Gson();
        return gson.toJson(o);
    }
}
