package com.hackathon.transit.stoptime.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Entity
@Table(name = "stop_times",
        indexes = {
                @Index(columnList = "stopId", name = "abcd")
        })
public class StopTime implements Serializable {

    private Integer tripId;
    private String arrivalTime;
    private String departureTime;
    private Integer stopId;
    private Integer stopSequence;

    public StopTime() {
    }

    public StopTime(Integer tripId, String arrivalTime, String departureTime, Integer stopId, Integer stopSequence) {
        this.tripId = tripId;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.stopId = stopId;
        this.stopSequence = stopSequence;
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

    @Column(name = "arrival_time")
    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Column(name = "departure_time")
    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Column(name = "stop_id")
    public Integer getStopId() {
        return stopId;
    }

    public void setStopId(Integer stopId) {
        this.stopId = stopId;
    }

    @Column(name = "stop_sequence")
    public Integer getStopSequence() {
        return stopSequence;
    }

    public void setStopSequence(Integer stopSequence) {
        this.stopSequence = stopSequence;
    }

    @Override
    public String toString() {
        return "StopTime {" +
                "tripId=" + tripId +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", stopId=" + stopId +
                ", stopSequence=" + stopSequence +
                '}';
    }
}