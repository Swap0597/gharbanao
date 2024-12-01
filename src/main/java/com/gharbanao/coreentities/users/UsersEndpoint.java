package com.gharbanao.coreentities.users;


import com.gharbanao.responses.Response;
import com.gharbanao.responses.ResponseConstants;
import com.gharbanao.serviceException.ServiceException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

@RestController
public class UsersEndpoint {

    UsersService usersService = null;
    UsersEndpoint (UsersService usersService){
        this.usersService = usersService;
    }

    @PostMapping("/user/create")
    @CrossOrigin(origins = "http://localhost:1234")
    public Response create(@RequestBody UsersMaster usersMaster) throws ServiceException, IOException, ExecutionException, InterruptedException {
        System.out.println(usersMaster.toString());
        return usersService.createUser(usersMaster);
    }
    @GetMapping("/user/get")
    public Response get(@RequestParam String emailId) throws ServiceException, IOException, ExecutionException, InterruptedException {
        UsersMaster usersMaster =  usersService.get(emailId);
        return new Response(ResponseConstants.SUCCESS, usersMaster, "User Added Successfully");
    }
    @PostMapping("/user/Update")
    @CrossOrigin(origins = "http://localhost:1234")
    public Response update(@RequestBody UsersMaster usersMaster) throws ServiceException, IOException, ExecutionException, InterruptedException {
        return usersService.updateUser(usersMaster);
    }

    @PostMapping("/user/login")
    @CrossOrigin(origins = "http://localhost:1234")
    public Response login(@RequestBody UsersMaster usersMaster) throws ServiceException, IOException, ExecutionException, InterruptedException {
        return usersService.login(usersMaster);
    }




}
