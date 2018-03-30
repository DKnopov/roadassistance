package com.roadassistance;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.mongodb.util.JSON;
import com.roadassistance.model.FirebaseGetKey;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoOperations;

import java.io.*;
import java.net.URL;

@SpringBootApplication
public class RoadassistanceApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RoadassistanceApplication.class, args);

        //FileInputStream serviceAccount = new FileInputStream(System.getenv("FIREBASE_KEY"));
        FileInputStream serviceAccount = new FileInputStream("roadassistanceserver-firebase-adminsdk-bnkfl-17c901f785.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://roadassistanceserver.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);

       /* FirebaseGetKey firebaseGetKey = new FirebaseGetKey();
        //firebaseGetKey.firebaseAdd();
        System.out.println(firebaseGetKey.firebaseKey());*/

    }
}
