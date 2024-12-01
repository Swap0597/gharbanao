package com.gharbanao.coreentities.productDetails;

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
public class ProductDetailsDao {
    public Response create(ProductDetailsMaster productDetailsMaster) throws ServiceException {
        try{
            Firestore firestore = Firestoreutility.getFireStoreService();
            DocumentReference docRef = firestore.collection("ProductDetails").document(productDetailsMaster.getName());
            System.out.println("product details " + productDetailsMaster.toString());
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> input = objectMapper.convertValue(productDetailsMaster, Map.class);
            System.out.println("input map " + input.toString());
            ApiFuture<WriteResult> result = docRef.set(input);
            return new Response(ResponseConstants.SUCCESS, input, "ProductDetails Added Successfully");
        } catch (Exception e){
//            throw new ServiceException(ResponseConstants.FAILURE, e.printStackTrace());
            e.printStackTrace();
        }
        return null;
    }

    public List<ProductDetailsMaster> get(String category) throws IOException, ExecutionException, InterruptedException {
        Firestore firestore = Firestoreutility.getFireStoreService();
        CollectionReference cities = firestore.collection("ProductDetails");
        Query query = cities.whereEqualTo("category", category);
        ApiFuture<QuerySnapshot> querySnapshot = query.get();
        List<ProductDetailsMaster> productDetailsMasters = new ArrayList<>();
        for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
            productDetailsMasters.add(document.toObject(ProductDetailsMaster.class));
        }
        return productDetailsMasters;
    }
}
