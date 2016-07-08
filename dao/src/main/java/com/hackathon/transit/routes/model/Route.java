package com.hackathon.transit.routes.model;

/**
 * Created by shubhamutwal on 09/07/16.
 */

import javax.persistence.*;
import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "routes")
public class Route implements Serializable {

    private Integer routeId;
    private String agencyId;
    private String routeShortName;
    private String routeLongName;
    private String routeDescription;
    private Integer routeType;
    private String routeUrl;
    private String routeColor;
    private String routeTextColor;

    public Route() {
    }

    public Route(Integer routeId, String agencyId, String routeShortName, String routeLongName,
                 String routeDescription, Integer routeType, String routeUrl, String routeColor,
                 String routeTextColor) {
        this.routeId = routeId;
        this.agencyId = agencyId;
        this.routeShortName = routeShortName;
        this.routeLongName = routeLongName;
        this.routeDescription = routeDescription;
        this.routeType = routeType;
        this.routeUrl = routeUrl;
        this.routeColor = routeColor;
        this.routeTextColor = routeTextColor;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "route_id")
    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    @Column(name = "agency_id")
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    @Column(name = "route_short_name")
    public String getRouteShortName() {
        return routeShortName;
    }

    public void setRouteShortName(String routeShortName) {
        this.routeShortName = routeShortName;
    }

    @Column(name = "route_long_name")
    public String getRouteLongName() {
        return routeLongName;
    }

    public void setRouteLongName(String routeLongName) {
        this.routeLongName = routeLongName;
    }

    @Column(name = "route_desc")
    public String getRouteDescription() {
        return routeDescription;
    }

    public void setRouteDescription(String routeDescription) {
        this.routeDescription = routeDescription;
    }

    @Column(name = "route_type")
    public Integer getRouteType() {
        return routeType;
    }

    public void setRouteType(Integer routeType) {
        this.routeType = routeType;
    }

    @Column(name = "route_url")
    public String getRouteUrl() {
        return routeUrl;
    }

    public void setRouteUrl(String routeUrl) {
        this.routeUrl = routeUrl;
    }

    @Column(name = "route_color")
    public String getRouteColor() {
        return routeColor;
    }

    public void setRouteColor(String routeColor) {
        this.routeColor = routeColor;
    }

    @Column(name = "route_text_color")
    public String getRouteTextColor() {
        return routeTextColor;
    }

    public void setRouteTextColor(String routeTextColor) {
        this.routeTextColor = routeTextColor;
    }

    @Override
    public String toString() {
        return "Route {" +
                "routeId=" + routeId +
                ", agencyId='" + agencyId + '\'' +
                ", routeShortName='" + routeShortName + '\'' +
                ", routeLongName='" + routeLongName + '\'' +
                ", routeDescription='" + routeDescription + '\'' +
                ", routeType=" + routeType +
                ", routeUrl='" + routeUrl + '\'' +
                ", routeColor='" + routeColor + '\'' +
                ", routeTextColor='" + routeTextColor + '\'' +
                '}';
    }
}