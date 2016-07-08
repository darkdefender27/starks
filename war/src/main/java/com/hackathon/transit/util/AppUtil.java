package com.hackathon.transit.util;

/**
 * Created by SAWAI on 7/8/2016.
 */
public class AppUtil {

    public static MovementType resolveMovement(int movementId) {
        for(MovementType movementType : MovementType.values()) {
            if(movementType.value == movementId)
                return movementType;
        }
        throw new RuntimeException("Movement type not supported!!!");
    }
}
