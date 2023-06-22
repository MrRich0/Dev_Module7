package org.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpStatusChecker {
    String getStatusImage(int code) throws IOException {
        URL url = new URL(String.format("https://http.cat/%d.jpg",code));

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.disconnect();

        if(connection.getResponseCode() == 404){
            throw new IOException("Image not found for status code:" + code);
        }

        return String.valueOf(url);
    }

//    public static void main(String[] args) throws IOException {
//        HttpStatusChecker checker = new HttpStatusChecker();
//        System.out.println("checker.getStatusImage(100) = " + checker.getStatusImage(400));
//    }
}
