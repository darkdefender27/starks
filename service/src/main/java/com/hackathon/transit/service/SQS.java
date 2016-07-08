package com.hackathon.transit.service;

/**
 * Created by SAWAI on 7/9/2016.
 */
public interface SQS {

    void publishMessage(String queueName, Object message);


    }
