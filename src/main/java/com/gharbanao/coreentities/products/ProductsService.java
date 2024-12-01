package com.gharbanao.coreentities.products;

import com.gharbanao.responses.Response;
import com.gharbanao.serviceException.ServiceException;
import com.gharbanao.utility.StringUtility;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class ProductsService {

    ProductsDao productsDao;
    public ProductsService(ProductsDao productsDao){
        this.productsDao = productsDao;
    }
    public Response create(ProductsMaster productsMaster) throws ServiceException {
       return productsDao.create (productsMaster);

    }

    public Response update(ProductsMaster productsMaster) throws ServiceException, IOException, ExecutionException, InterruptedException {
        if(StringUtility.isnotNullOrBlank(productsMaster.getName())){
            ProductsMaster existingProductsMaster = getByName(productsMaster.getName());
            existingProductsMaster.setEnable(productsMaster.isEnable());
            existingProductsMaster.setInfo(productsMaster.getInfo());
            existingProductsMaster.getFeatures().addAll(productsMaster.getFeatures());
            existingProductsMaster.setSettingTime(productsMaster.getSettingTime());
            existingProductsMaster.setSize(productsMaster.getSize());
            existingProductsMaster.setImageLink(productsMaster.getImageLink());
            existingProductsMaster.setAdditionalInfo1(productsMaster.getAdditionalInfo1());
            existingProductsMaster.setAdditionalInfo2(productsMaster.getAdditionalInfo2());
            existingProductsMaster.setAdditionalInfo3(productsMaster.getAdditionalInfo3());
            existingProductsMaster.setTypes(productsMaster.getTypes());
            existingProductsMaster.setStrength(productsMaster.getStrength());
            existingProductsMaster.setSustainability(productsMaster.getSustainability());
        }
        return null;
    }

    public ProductsMaster getByName(String name) throws ServiceException, IOException, ExecutionException, InterruptedException {
        return productsDao.getByName(name);

    }

    public List<ProductsMaster> getAll() throws IOException, ExecutionException, InterruptedException {
        return productsDao.getAll();

    }

    public Response getAllEnabled() {
        return null;
    }

    public Response delete() {
        return null;

    }
}
