package com.hackathon.transit.service;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClient;
import com.amazonaws.services.sqs.model.GetQueueUrlRequest;
import com.amazonaws.services.sqs.model.SendMessageRequest;
import com.amazonaws.services.sqs.model.SendMessageResult;
import com.hackathon.transit.service.util.ServiceUtil;
import org.apache.log4j.Logger;

/**
 * Created by SAWAI on 7/9/2016.
 */
public class SQSImpl implements SQS{

    Logger logger = Logger.getLogger(SQSImpl.class);
    private AmazonSQS sqs = null;

    public SQSImpl(String accessKey, String secretKey, String endPoint) {
        createSQSClient(accessKey, secretKey,endPoint);
    }

    private void createSQSClient(String accessKey, String secretKey, String endPoint) {
        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey,secretKey);
        sqs = new AmazonSQSClient(credentials);
        sqs.setEndpoint(endPoint);
    }

    public String getQueueURL(String queueName) {
        GetQueueUrlRequest getQueueUrlRequest = new GetQueueUrlRequest(queueName);
        return sqs.getQueueUrl(getQueueUrlRequest).getQueueUrl();
    }

    public void publishMessage(String queueName, Object message) {
        String payload = ServiceUtil.toJson(message);
        SendMessageRequest sendMessageRequest = new SendMessageRequest(getQueueURL(queueName), payload);
        SendMessageResult sendMessageResult = sqs.sendMessage(sendMessageRequest);
        logger.info("Message sent " + sendMessageResult.getMessageId() + " : " + payload);

    }



}
