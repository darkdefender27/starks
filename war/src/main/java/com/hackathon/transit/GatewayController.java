package com.hackathon.transit;

import com.hackathon.transit.util.AppUtil;
import com.hackathon.transit.util.MovementType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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


    @ResponseBody
    @RequestMapping(value = "movement/{vehicleId}/{movementId}", method = RequestMethod.GET)
    public String getMovie(@PathVariable("vehicleId") String vehicleId,
                           @PathVariable("movementId") int movementId) {
        MovementType movementType = AppUtil.resolveMovement(movementId);
        System.out.println(vehicleId  + "---" + movementType.name());
        return "data submitted!";
    }


    @RequestMapping(value = "/position/{vehicleId}/{latitude}/{longitude}", method = RequestMethod.GET)
    @ResponseBody
    public String getDefaultMovie(@PathVariable("vehicleId") String vehicleId,
                                  @PathVariable("latitude") String latitude,
                                  @PathVariable("longitude") String longitude) {
        System.out.println(vehicleId  + "---" + latitude + "--" + longitude);
        return "list";

    }


}
