package com.hackathon.transit;

import com.hackathon.transit.constants.AppConstants;
import com.hackathon.transit.service.SQS;
import com.hackathon.transit.util.AppUtil;
import com.hackathon.transit.util.MovementType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by SAWAI on 7/8/2016.
 */
@Controller
@RequestMapping("/gateway")
public class GatewayController {

    @Autowired
    SQS sqs;

    @ResponseBody
    @RequestMapping(value = "movement/{vehicleId}/{movementId}", method = RequestMethod.GET)
    public String getMovie(@PathVariable("vehicleId") String vehicleId,
                           @PathVariable("movementId") int movementId) {
        MovementType movementType = AppUtil.resolveMovement(movementId);
        String string = vehicleId + "---" + movementType.name();
        sqs.publishMessage(AppConstants.TRANSIT_DATA_QUEUE_NAME, string);
        System.out.println(string);
        return string;
    }


    @RequestMapping(value = "/position/{vehicleId}/{latitude}/{longitude}", method = RequestMethod.GET)
    @ResponseBody
    public String getDefaultMovie(@PathVariable("vehicleId") String vehicleId,
                                  @PathVariable("latitude") String latitude,
                                  @PathVariable("longitude") String longitude) {
        String string = vehicleId + "---" + latitude + "--" + longitude;
        System.out.println(string);
        return string;

    }


}
