package com.gharbanao.coreentities.houses;

import com.gharbanao.responses.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class HouseService {

    HouseDao houseDao;

    HouseService(HouseDao houseDao){
        this.houseDao = houseDao;
    }
    public Response create(HouseMaster houseMaster) throws IOException {
        return houseDao.create(houseMaster);
    }

    public List<HouseMaster> getAll() throws IOException, ExecutionException, InterruptedException {
        return houseDao.getAll();
    }
}
