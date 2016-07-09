package com.hackathon.transit.service.dao;

import com.hackathon.transit.stops.dao.StopDao;
import com.hackathon.transit.stops.model.Stop;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by SAWAI on 7/9/2016.
 */
public class BusStopsImpl implements BusStops {

    Logger logger = Logger.getLogger(BusStopsImpl.class);
   /* @Autowired*/
    private StopDao stopDao;

    public List<Stop> getBusStops() {

        List<Stop> busStops = stopDao.getBusStops();
        for(Stop stop : busStops) {
            logger.info(stop.getStopName());
        }
        return busStops;
    }

}
