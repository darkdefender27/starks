package com.hackathon.transit.stops.model;

/**
 * Created by shubhamutwal on 09/07/16.
 */

import javax.persistence.*;
import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "stops")
public class Stop implements Serializable {

    private Integer stopId;
    private String stopName;
    private String stopDesc;
    private Double stopLat;
    private Double stopLon;
    private String zoneId;
    private String stopUrl;

    public Stop() {
    }

    public Stop(Integer stopId, String stopName, String stopDesc, Double stopLat,
                Double stopLon, String zoneId, String stopUrl) {
        this.stopId = stopId;
        this.stopName = stopName;
        this.stopDesc = stopDesc;
        this.stopLat = stopLat;
        this.stopLon = stopLon;
        this.zoneId = zoneId;
        this.stopUrl = stopUrl;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "stop_id")
    public Integer getStopId() {
        return stopId;
    }

    public void setStopId(Integer stopId) {
        this.stopId = stopId;
    }

    @Column(name = "stop_name")
    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    @Column(name = "stop_desc")
    public String getStopDesc() {
        return stopDesc;
    }

    public void setStopDesc(String stopDesc) {
        this.stopDesc = stopDesc;
    }

    @Column(name = "stop_lat")
    public Double getStopLat() {
        return stopLat;
    }

    public void setStopLat(Double stopLat) {
        this.stopLat = stopLat;
    }

    @Column(name = "stop_lon")
    public Double getStopLon() {
        return stopLon;
    }

    public void setStopLon(Double stopLon) {
        this.stopLon = stopLon;
    }

    @Column(name = "zone_id")
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    @Column(name = "stop_url")
    public String getStopUrl() {
        return stopUrl;
    }

    public void setStopUrl(String stopUrl) {
        this.stopUrl = stopUrl;
    }

    @Override
    public String toString() {
        return "Stop {" +
                "stopId=" + stopId +
                ", stopName='" + stopName + '\'' +
                ", stopDesc='" + stopDesc + '\'' +
                ", stopLat=" + stopLat +
                ", stopLon=" + stopLon +
                ", zoneId='" + zoneId + '\'' +
                ", stopUrl='" + stopUrl + '\'' +
                '}';
    }
}
