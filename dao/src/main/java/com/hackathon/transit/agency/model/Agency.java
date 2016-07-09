package com.hackathon.transit.agency.model;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by shubhamutwal on 09/07/16.
 */
@Entity
@Table(name = "agency")
public class Agency implements Serializable {

    private String agencyId;
    private String agencyName;
    private String agencyUrl;
    private String agencyTimeZone;
    private String agencyLang;
    private String agencyPhone;

    public Agency() {
    }

    public Agency(String agencyId, String agencyName, String agencyUrl, String agencyTimeZone, String agencyLang, String agencyPhone) {
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.agencyUrl = agencyUrl;
        this.agencyTimeZone = agencyTimeZone;
        this.agencyLang = agencyLang;
        this.agencyPhone = agencyPhone;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "agency_id")
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    @Column(name = "agency_name")
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Column(name = "agency_url")
    public String getAgencyUrl() {
        return agencyUrl;
    }

    public void setAgencyUrl(String agencyUrl) {
        this.agencyUrl = agencyUrl;
    }

    @Column(name = "agency_timezone")
    public String getAgencyTimeZone() {
        return agencyTimeZone;
    }

    public void setAgencyTimeZone(String agencyTimeZone) {
        this.agencyTimeZone = agencyTimeZone;
    }

    @Column(name = "agency_lang")
    public String getAgencyLang() {
        return agencyLang;
    }

    public void setAgencyLang(String agencyLang) {
        this.agencyLang = agencyLang;
    }

    @Column(name = "agency_phone")
    public String getAgencyPhone() {
        return agencyPhone;
    }

    public void setAgencyPhone(String agencyPhone) {
        this.agencyPhone = agencyPhone;
    }

    @Override
    public String toString() {
        return "Agency {" +
                "agencyId='" + agencyId + '\'' +
                ", agencyName='" + agencyName + '\'' +
                ", agencyUrl='" + agencyUrl + '\'' +
                ", agencyTimeZone='" + agencyTimeZone + '\'' +
                ", agencyLang='" + agencyLang + '\'' +
                ", agencyPhone='" + agencyPhone + '\'' +
                '}';
    }
}