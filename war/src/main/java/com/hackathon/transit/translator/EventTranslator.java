package com.hackathon.transit.translator;

import com.hackathon.transit.constants.AppConstants;
import com.hackathon.transit.enums.SensorTypes;
import com.hackathon.transit.service.event.schema.Tags;
import com.hackathon.transit.service.event.schema.VehicleDensityEvent;
import com.hackathon.transit.util.MovementType;

import java.util.Date;

/**
 * Created by SAWAI on 7/9/2016.
 */
public class EventTranslator {

    public static VehicleDensityEvent getVehicleDensityEvent(MovementType movementType, String vehicleId) {
        VehicleDensityEvent vehicleDensityEvent = new VehicleDensityEvent();
        vehicleDensityEvent.setValue(getVehicleDensityValue(movementType));
        vehicleDensityEvent.setTimestamp(new Date().getTime());
        vehicleDensityEvent.setMetric(AppConstants.APP_METRIC);
        Tags tags = new Tags();
        tags.setSensor("S1");
        tags.setVehicleId(vehicleId);
        tags.setSensorType(SensorTypes.BUS_DENSITY.name());
        vehicleDensityEvent.setTags(tags);
        return vehicleDensityEvent;
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
}
