package com.hackathon.transit.translator;

import com.hackathon.transit.constants.AppConstants;
import com.hackathon.transit.enums.SensorTypes;
import com.hackathon.transit.service.event.schema.GPSPosition;
import com.hackathon.transit.service.event.schema.Tags;
import com.hackathon.transit.service.event.schema.Event;
import com.hackathon.transit.util.MovementType;

import java.util.Date;

/**
 * Created by SAWAI on 7/9/2016.
 */
public class EventTranslator {

    public static Event getVehicleDensityEvent(MovementType movementType, String vehicleId) {
        Event event = new Event();
        event.setValue(getVehicleDensityValue(movementType));
        event.setTimestamp((getTimeStamp()));
        event.setMetric(AppConstants.APP_METRIC);
        Tags tags = new Tags();
        tags.setSensor("S1");
        tags.setBus_id(vehicleId);
        tags.setSensor_type(SensorTypes.BUS_DENSITY.getValue());
        event.setTags(tags);
        return event;
    }

    private static int getVehicleDensityValue(MovementType movementType) {
        if(movementType == MovementType.ABOARD)
        {
            return 1;
        }
        else {
            return -1;
        }
    }

    public static Event getVehiclePositionEvent(String latitude, String longitude, String vehicleId) {
        Event vehiclePositionEvent = new Event();
        vehiclePositionEvent.setTimestamp(getTimeStamp());
        vehiclePositionEvent.setMetric(AppConstants.APP_METRIC);
        Tags tags = new Tags();
        tags.setSensor("S2");
        tags.setBus_id(vehicleId);
        tags.setGpsPosition(getGPSPosition(latitude, longitude));
        tags.setSensor_type(SensorTypes.GPS.getValue());
        vehiclePositionEvent.setTags(tags);
        return vehiclePositionEvent;
    }

    private static long getTimeStamp() {
        return new Date().getTime()/1000;
    }

    private static GPSPosition getGPSPosition(String latitude, String longitude) {
        GPSPosition gpsPosition = new GPSPosition();
        gpsPosition.setLatitude(latitude);
        gpsPosition.setLongitude(longitude);
        return gpsPosition;
    }


}
