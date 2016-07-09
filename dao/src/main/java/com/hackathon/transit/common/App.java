package com.hackathon.transit.common;

import com.hackathon.transit.starks.bo.StarksBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
        /*

        StopBo stopBo = (StopBo) appContext.getBean("stopBo");
        List stopsList = stopBo.findBySrcAndDestLatLong(0.0, 0.0, 0.0, 703.0);

        for(int i=0;i<stopsList.size();i++) {

           Stop stop=(Stop)stopsList.get(i);
           StopTimeBo stopTimeBo = (StopTimeBo) appContext.getBean("stopTimeBo");
           List stopTimeList = stopTimeBo.findByStopId(stop.getStopId());
           for(int j=0;j<stopTimeList.size();j++){
               //System.out.println((StopTime)stopTimeList.get(j));
               StopTime stopTime=(StopTime)stopTimeList.get(j);
               TripBo tripBo=(TripBo) appContext.getBean("tripBo");
               List tripList = tripBo.findByTripId(stopTime.getTripId());

               for(int k=0;k<tripList.size();k++){
                   Trip trip=(Trip)tripList.get(k);
                   RouteBO routeBO=(RouteBO)appContext.getBean("routeBo");
                   List routeList = routeBO.findByRouteId(trip.getRouteId());
                   for(int p=0;p<routeList.size();p++){
                       System.out.println((Route)routeList.get(p));
                   }
               }
           }
        }
        */

        Double sourceLat = 18.4287248157414;
        Double sourceLon = 18.5665579874744;

        Double destLat = 73.756157988755;
        Double destLon = 73.9084024898728;
        
        StarksBo starksBo = (StarksBo) appContext.getBean("starksBo");
        List routeList = starksBo.getBusListBetweenSourceAndDestination(sourceLat, sourceLon, destLat, destLon);
        for (Object route : routeList) {
            System.out.println("Route: " + route);
        }

        System.out.println("Done!");
    }
}