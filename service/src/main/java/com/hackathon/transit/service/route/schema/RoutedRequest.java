package com.hackathon.transit.service.route.schema;

import com.hackathon.transit.service.event.schema.GPSPosition;

/**
 * Created by SAWAI on 7/10/2016.
 */
public class RoutedRequest {
    private GPSPosition userPosition;
    private GPSPosition destination;
    private int noOfPax;

    public GPSPosition getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(GPSPosition userPosition) {
        this.userPosition = userPosition;
    }

    public GPSPosition getDestination() {
        return destination;
    }

    public void setDestination(GPSPosition destination) {
        this.destination = destination;
    }

    public int getNoOfPax() {
        return noOfPax;
    }

    public void setNoOfPax(int noOfPax) {
        this.noOfPax = noOfPax;
    }


}
