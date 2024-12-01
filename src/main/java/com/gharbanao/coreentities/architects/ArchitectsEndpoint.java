package com.gharbanao.coreentities.architects;

import com.gharbanao.coreentities.houses.HouseMaster;
import com.gharbanao.responses.Response;
import com.gharbanao.responses.ResponseConstants;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/architects")
public class ArchitectsEndpoint {

    ArchitectsService architectsService;

    ArchitectsEndpoint(ArchitectsService architectsService){
        this.architectsService = architectsService;
    }

    @PostMapping("/create")
    public Response create(@RequestBody ArchitectMaster architectMaster){
        return architectsService.create(architectMaster);
    }

    @GetMapping("/get")
    public Response get() throws IOException, ExecutionException, InterruptedException {
        List<ArchitectMaster> architectMasterList = architectsService.getAll();
        return new Response(ResponseConstants.SUCCESS, architectMasterList, "All house fetched");
    }
}
