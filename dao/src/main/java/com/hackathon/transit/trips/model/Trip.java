package com.hackathon.transit.trips.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by shubhamutwal on 09/07/16.
 */

@Entity
@Table(name = "trips",
        indexes = {
                @Index(columnList = "tripId", name = "xyzw")
        })
public class Trip {

    private Integer routeId;
    private String serviceId;
    private Integer tripId;
    private String tripHeadSign;
    private Integer directionId;
    private String blockId;
    private String shapeId;

    public Trip() {
    }

    public Trip(Integer routeId, String serviceId, Integer tripId, String tripHeadSign,
                Integer directionId, String blockId, String shapeId) {
        this.routeId = routeId;
        this.serviceId = serviceId;
        this.tripId = tripId;
        this.tripHeadSign = tripHeadSign;
        this.directionId = directionId;
        this.blockId = blockId;
        this.shapeId = shapeId;
    }

    @Column(name = "route_id")
    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    @Column(name = "service_id")
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "trip_id")
    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    @Column(name = "trip_headsign")
    public String getTripHeadSign() {
        return tripHeadSign;
    }

    public void setTripHeadSign(String tripHeadSign) {
        this.tripHeadSign = tripHeadSign;
    }

    @Column(name = "direction_id")
    public Integer getDirectionId() {
        return directionId;
    }

    public void setDirectionId(Integer directionId) {
        this.directionId = directionId;
    }

    @Column(name = "block_id")
    public String getBlockId() {
        return blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    @Column(name = "shape_id")
    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    @Override
    public String toString() {
        return "Trip {" +
                "routeId=" + routeId +
                ", serviceId='" + serviceId + '\'' +
                ", tripId=" + tripId +
                ", tripHeadSign='" + tripHeadSign + '\'' +
                ", directionId=" + directionId +
                ", blockId='" + blockId + '\'' +
                ", shapeId='" + shapeId + '\'' +
                '}';
    }
}
