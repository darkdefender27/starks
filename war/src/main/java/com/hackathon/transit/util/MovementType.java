package com.hackathon.transit.util;

/**
 * Created by SAWAI on 7/8/2016.
 */
public enum MovementType {
    ABOARD(0),
    DEBOARD(1);

    int value;


    MovementType(int i) {
        this.value = i;
    }
}
