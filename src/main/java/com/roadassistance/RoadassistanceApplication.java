package com.roadassistance;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
public class RoadassistanceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(RoadassistanceApplication.class, args);
		FileInputStream serviceAccount = new FileInputStream("C:\\Users\\1\\IdeaProjects\\roadassistance\\roadassistanceserver-firebase-adminsdk-bnkfl-17c901f785.json");

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.setDatabaseUrl("https://roadassistanceserver.firebaseio.com")
				.build();

		FirebaseApp.initializeApp(options);

	}
}
