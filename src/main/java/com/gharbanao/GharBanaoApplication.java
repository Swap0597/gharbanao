package com.gharbanao;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Controller
@SpringBootApplication
public class GharBanaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GharBanaoApplication.class, args);
	}

//	@GetMapping("/get")
//	public static void getData() throws IOException, ExecutionException, InterruptedException {
//		FirestoreOptions firestoreOptions =
//				FirestoreOptions.getDefaultInstance().toBuilder()
//						.setProjectId("ghar-banao-440411")
//						.setCredentials(GoogleCredentials.getApplicationDefault())
//						.build();
//		Firestore db = firestoreOptions.getService();
//
//
//		DocumentReference docRef = db.collection("UsersMaster").document("Swapnil007");
//// Add document data  with id "alovelace" using a hashmap
//		Map<String, Object> data = new HashMap<>();
//		data.put("first", "Ada");
//		data.put("last", "Lovelace");
//		data.put("middle", "Mathison");
//		data.put("born", 1815);
////asynchronously write data
//		ApiFuture<WriteResult> result = docRef.set(data);
//// ...
//// result.get() blocks on response
//		System.out.println("Update time : " + result.get().getUpdateTime());
//
//		// asynchronously retrieve all users
//		ApiFuture<QuerySnapshot> query = db.collection("UsersMaster").get();
//// ...
//// query.get() blocks on response
//		QuerySnapshot querySnapshot = query.get();
//		List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
//		for (QueryDocumentSnapshot document : documents) {
//			System.out.println("Swapnil007: " + document.getId());
//			System.out.println("First: " + document.getString("first"));
//			if (document.contains("middle")) {
//				System.out.println("Middle: " + document.getString("middle"));
//			}
//			System.out.println("Last: " + document.getString("last"));
//			System.out.println("Born: " + document.getLong("born"));
//		}
//	}
}
