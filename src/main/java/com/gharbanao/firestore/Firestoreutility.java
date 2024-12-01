package com.gharbanao.firestore;

import com.gharbanao.constants.Constants;
import com.gharbanao.coreentities.users.UsersMaster;
import com.gharbanao.responses.ResponseConstants;
import com.gharbanao.serviceException.ServiceException;
import com.gharbanao.utility.Utility;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Firestoreutility {
    public static Firestore getFireStoreService() throws IOException {
        FirestoreOptions firestoreOptions =
                FirestoreOptions.getDefaultInstance().toBuilder()
                        .setProjectId(Constants.PROJECT_ID)
                        .setCredentials(GoogleCredentials.getApplicationDefault())
                        .build();
        return firestoreOptions.getService();
    }
    public static Object getFirestoreEntity(DocumentReference docRef) throws ExecutionException, InterruptedException, ServiceException {
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (document.exists()) {
            return document.toObject(UsersMaster.class);
        } else {
            throw new ServiceException(ResponseConstants.FAILURE, "Failed to get Firestore Entity");
        }
    }
    public static Object getFirestoreEntity(DocumentReference docRef, Class<?> classs) throws ExecutionException, InterruptedException, ServiceException {
        ApiFuture<DocumentSnapshot> future = docRef.get();
        DocumentSnapshot document = future.get();
        if (document.exists()) {
            return document.toObject(classs);
        }
            return null;
    }

}
