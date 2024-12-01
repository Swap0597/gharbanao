package com.gharbanao.coreentities.houses;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gharbanao.coreentities.productDetails.ProductDetailsMaster;
import com.gharbanao.coreentities.products.ProductsMaster;
import com.gharbanao.firestore.Firestoreutility;
import com.gharbanao.responses.Response;
import com.gharbanao.responses.ResponseConstants;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Repository
public class HouseDao {
    public Response create(HouseMaster houseMaster) throws IOException {
        try{
            Firestore firestore = Firestoreutility.getFireStoreService();
            DocumentReference docRef = firestore.collection("Houses").document(houseMaster.getName());
            System.out.println("houseMaster " + houseMaster.toString());
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> input = objectMapper.convertValue(houseMaster, Map.class);
            System.out.println("input map " + input.toString());
            ApiFuture<WriteResult> result = docRef.set(input);
            return new Response(ResponseConstants.SUCCESS, houseMaster, "ProductDetails Added Successfully");
        } catch (Exception e){
//            throw new ServiceException(ResponseConstants.FAILURE, e.printStackTrace());
            e.printStackTrace();
        }
        return null;
    }

    public List<HouseMaster> getAll() throws IOException, ExecutionException, InterruptedException {
        List<HouseMaster> list = new ArrayList<>();
        Firestore firestore = Firestoreutility.getFireStoreService();
        ApiFuture<QuerySnapshot> future = firestore.collection("Houses").get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        for (QueryDocumentSnapshot document : documents) {
//            System.out.println(document.getId() + " => " + document.toObject(ProductsMaster.class));
            list.add(document.toObject(HouseMaster.class));
        }
        return list;
    }
}
