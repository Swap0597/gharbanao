package com.gharbanao.coreentities.users;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gharbanao.serviceException.ServiceException;
import com.gharbanao.firestore.Firestoreutility;
import com.gharbanao.responses.Response;
import com.gharbanao.responses.ResponseConstants;
import com.gharbanao.utility.StringUtility;
import com.gharbanao.utility.Utility;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Repository
public class UsersDao {

    public Response createUser(UsersMaster usersMaster) throws IOException, ServiceException {
        try{
            Firestore firestore = Firestoreutility.getFireStoreService();
            DocumentReference docRef = firestore.collection("UsersMaster").document(usersMaster.getEmailId());
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, Object> input = objectMapper.convertValue(usersMaster, Map.class);
            System.out.println("input map " + input.toString());
            ApiFuture<WriteResult> result = docRef.set(input);
            return new Response(ResponseConstants.SUCCESS, input, "User Added Successfully");
        } catch (Exception e){
            throw new ServiceException(ResponseConstants.FAILURE, e.getMessage());
        }

    }

    public UsersMaster getUser(String emailId) throws IOException, ExecutionException, InterruptedException, ServiceException {
        Firestore firestore = Firestoreutility.getFireStoreService();
        DocumentReference docRef = firestore.collection("UsersMaster").document(emailId);
        if(Utility.isNotNull(docRef)){
            return (UsersMaster) Firestoreutility.getFirestoreEntity(docRef, UsersMaster.class);
        }
        return null;
    }
    public Response updateUser(UsersMaster usersMaster) throws ServiceException, IOException, ExecutionException, InterruptedException {
        UsersDao usersDao = new UsersDao();
        UsersMaster usersMaster1 = getUser(usersMaster.getEmailId());
        updateData(usersMaster1, usersMaster);
        return usersDao.createUser(usersMaster1);
    }

    private void updateData(UsersMaster currUserDetails, UsersMaster newUserDetails) {
        if (StringUtility.isnotNullOrBlank(newUserDetails.getFirstName()))  currUserDetails.setFirstName(newUserDetails.getFirstName());
        if (StringUtility.isnotNullOrBlank(newUserDetails.getLastName()))  currUserDetails.setLastName(newUserDetails.getLastName());
        if (StringUtility.isnotNullOrBlank(newUserDetails.getPassword()))  currUserDetails.setPassword(newUserDetails.getPassword());
        if (Utility.isNotNullOrBlank(newUserDetails.getAddresses()))  currUserDetails.setAddresses(newUserDetails.getAddresses());
    }

    private Map<String, Object> getmap(UsersMaster usersMaster) {
        Map<String, Object> inputMap = new HashMap<>();
        inputMap.put("firstName", (StringUtility.isnotNullOrBlank(usersMaster.getFirstName())? usersMaster.getFirstName() : null));
        inputMap.put("lastName", (StringUtility.isnotNullOrBlank(usersMaster.getLastName()) ? usersMaster.getLastName() : null));
        inputMap.put("addresses", (Utility.isNotNullOrBlank(usersMaster.getAddresses()) ? usersMaster.getAddresses() : null));
        inputMap.put("billId", (Utility.isNotNullOrBlank(usersMaster.getBillId()) ? usersMaster.getBillId() : null));
        inputMap.put("emailId", (StringUtility.isnotNullOrBlank(usersMaster.getEmailId()) ? usersMaster.getEmailId() : null));
        inputMap.put("password", (StringUtility.isnotNullOrBlank(usersMaster.getPassword()) ? usersMaster.getPassword() : null));

        return inputMap;
    }

}
