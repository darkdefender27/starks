package com.hackathon.transit.service.event.schema;

/**
 * Created by SAWAI on 7/9/2016.
 */
public class BusDensityEvent {
    private String metric;
    private long timestamp;
    private int value;
    private Tags tags;

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Tags getTags() {
        return tags;
    }

    public void setTags(Tags tags) {
        this.tags = tags;
    }
}
