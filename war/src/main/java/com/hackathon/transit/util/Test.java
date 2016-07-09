package com.hackathon.transit.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.File;
import java.io.IOException;

/**
 * Created by SAWAI on 7/9/2016.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        File file = new File("E:\\PROJECTS\\git\\repos\\openshift\\firstapp\\mytomcatapp\\pom.xml");
        String url = "http://mytomcatapp-yaduserver.rhcloud.com/rest/data/fileUpload/upload";
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);

        MultipartEntity entity = new MultipartEntity();
        entity.addPart("fileUpload", new FileBody(file));
        post.setEntity(entity);

        HttpResponse response = client.execute(post);
    }
}
