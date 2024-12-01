package com.gharbanao.coreentities.architects;

import com.gharbanao.responses.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class ArchitectsService {
    AarchitectsDao aarchitectsDao;

    ArchitectsService(AarchitectsDao aarchitectsDao){
        this.aarchitectsDao = aarchitectsDao;
    }
    public Response create(ArchitectMaster architectMaster) {
        architectMaster.setId("123245");
        return aarchitectsDao.create(architectMaster);
    }

    public List<ArchitectMaster> getAll() throws IOException, ExecutionException, InterruptedException {
        return aarchitectsDao.getAll();
    }
}
