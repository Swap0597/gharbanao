package com.gharbanao.coreentities.houses;

import com.gharbanao.responses.Response;
import com.gharbanao.responses.ResponseConstants;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/houses")
public class HouseEndpoint {
    HouseService houseService;

    HouseEndpoint(HouseService houseService){
         this.houseService = houseService;
    }

    @PostMapping("/create")
    public Response create(@RequestBody HouseMaster houseMaster) throws IOException {
        return houseService.create(houseMaster);
    }

    @GetMapping("/getAll")
    public Response getAll() throws IOException, ExecutionException, InterruptedException {
        List<HouseMaster> houseMasterList = houseService.getAll();
        return new Response(ResponseConstants.SUCCESS, houseMasterList, "All house fetched");
    }


}
