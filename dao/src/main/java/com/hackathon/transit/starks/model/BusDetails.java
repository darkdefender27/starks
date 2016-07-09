package com.hackathon.transit.starks.model;

import java.io.Serializable;

/**
 * Created by shubhamutwal on 09/07/16.
 */
public class BusDetails implements Serializable {

    /*select route_short_name from routes where route_id =
     any (
     select route_id from trips where trip_id =
     any(
     select trip_id from stop_times where stop_id =
     any ( select stop_id from stops where
     ((stop_lat > 18.5665579874744 and stop_lon > 73.9084024898728)
     and (stop_lat < 18.4287248157414 and stop_lon < 73.756157988755) )or
     ((stop_lat < 18.5665579874744 and stop_lon < 73.9084024898728) and
     (stop_lat > 18.4287248157414 and stop_lon > 73.756157988755)))));*/

}
