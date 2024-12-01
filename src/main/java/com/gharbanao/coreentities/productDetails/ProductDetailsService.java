package com.gharbanao.coreentities.productDetails;

import com.gharbanao.responses.Response;
import com.gharbanao.serviceException.ServiceException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class ProductDetailsService {

    ProductDetailsDao productDetailsDao;
    public ProductDetailsService (ProductDetailsDao productDetailsDao){
        this.productDetailsDao = productDetailsDao;
    }


    public Response create(ProductDetailsMaster productDetailsMaster) throws ServiceException {
        // if naot enabled not get it
        return productDetailsDao.create(productDetailsMaster);

    }

    public List<ProductDetailsMaster> get(String category) throws IOException, ExecutionException, InterruptedException {
        return productDetailsDao.get(category);
    }

    public Response update(ProductDetailsMaster productDetailsMaster) {
        // if exist then update
        return null;
    }

    public Response enable(String name){
        // if disable then enable
        return null;
    }


    public Response disable(String name) {
        // if enable then disable
        return null;
    }
}
