package com.roadassistance.model;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Message;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

@Component
public class FBMessenger {
    String response;

    public FBMessenger() throws IOException {
        FileInputStream serviceAccount = new FileInputStream("C:\\roadassistanceserver-firebase-adminsdk-bnkfl-6ab20344ee.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://roadassistanceserver.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);

    }

    public void sendMessage(String messege) throws ExecutionException, InterruptedException {
        Message message = Message.builder()
                .putData("1", "Test").setToken("dlG95T5U8jg:APA91bE9Z9KoW88iYojnF_AMsG02X6wMPRCaLdnPxXzl3kP9Atiy0USH4pIbsRbVvnjXuiqgt7k4op1rY1Uv2fa-Ces8pL3coFFC-LRudMjM4gGu1iKUoAlbFPhyynL_SzTHy6o8FVNf").build();
        response = FirebaseMessaging.getInstance().sendAsync(message).get();
        System.out.println(response);
    }

}
