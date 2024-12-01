package com.gharbanao.coreentities.products;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gharbanao.firestore.Firestoreutility;
import com.gharbanao.responses.Response;
import com.gharbanao.responses.ResponseConstants;
import com.gharbanao.serviceException.ServiceException;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Repository
public class ProductsDao {
    public Response create(ProductsMaster productsMaster) throws ServiceException {
        try{
            Firestore firestore = Firestoreutility.getFireStoreService();
            DocumentReference docRef = firestore.collection("Products").document(productsMaster.getName());
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> input = objectMapper.convertValue(productsMaster, Map.class);
            System.out.println("input map " + input.toString());
            ApiFuture<WriteResult> result = docRef.set(input);
            return new Response(ResponseConstants.SUCCESS, input, "Product Added Successfully");
        } catch (Exception e){
            throw new ServiceException(ResponseConstants.FAILURE, e.getMessage());
        }
    }

    public ProductsMaster getByName(String name) throws IOException, ServiceException, ExecutionException, InterruptedException {
        Firestore firestore = Firestoreutility.getFireStoreService();
        DocumentReference docRef = firestore.collection("Products").document(name);
        return (ProductsMaster) Firestoreutility.getFirestoreEntity(docRef, ProductsMaster.class);

    }

    public List<ProductsMaster> getAll() throws IOException, ExecutionException, InterruptedException {
        List<ProductsMaster> list = new ArrayList<>();
        Firestore firestore = Firestoreutility.getFireStoreService();
        ApiFuture<QuerySnapshot> future = firestore.collection("Products").get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            System.out.println(document.getId() + " => " + document.toObject(ProductsMaster.class));
            list.add(document.toObject(ProductsMaster.class));
        }
        return list;
    }
}
