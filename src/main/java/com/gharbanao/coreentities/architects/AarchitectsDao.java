package com.gharbanao.coreentities.architects;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gharbanao.coreentities.houses.HouseMaster;
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
public class AarchitectsDao {
    public Response create(ArchitectMaster architectMaster) {
        {
            try{
                Firestore firestore = Firestoreutility.getFireStoreService();
                DocumentReference docRef = firestore.collection("Architect").document(architectMaster.getId());
                System.out.println("architectMaster " + architectMaster.toString());
                ObjectMapper objectMapper = new ObjectMapper();
                Map<String, Object> input = objectMapper.convertValue(architectMaster, Map.class);
                System.out.println("input map " + input.toString());
                ApiFuture<WriteResult> result = docRef.set(input);
                return new Response(ResponseConstants.SUCCESS, architectMaster, "architectMaster Added Successfully");
            } catch (Exception e){
//            throw new ServiceException(ResponseConstants.FAILURE, e.printStackTrace());
                e.printStackTrace();
            }
            return null;
        }
    }

    public List<ArchitectMaster> getAll() throws IOException, ExecutionException, InterruptedException {
        {
            List<ArchitectMaster> list = new ArrayList<>();
            Firestore firestore = Firestoreutility.getFireStoreService();
            ApiFuture<QuerySnapshot> future = firestore.collection("Architect").get();
            List<QueryDocumentSnapshot> documents = future.get().getDocuments();
            for (QueryDocumentSnapshot document : documents) {
                System.out.println(document.getId() + " => " + document.toObject(ArchitectMaster.class));
                list.add(document.toObject(ArchitectMaster.class));
            }
            return list;
        }
    }
}
