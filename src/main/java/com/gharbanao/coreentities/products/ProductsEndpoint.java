package com.gharbanao.coreentities.products;

import com.gharbanao.responses.Response;
import com.gharbanao.responses.ResponseConstants;
import com.gharbanao.serviceException.ServiceException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/products")
public class ProductsEndpoint {
    ProductsService productsService;
    public ProductsEndpoint(ProductsService productsService){
        this.productsService = productsService;
    }

    @PostMapping("/create")
    public Response create(@RequestBody ProductsMaster productsMaster) throws ServiceException {
       return productsService.create(productsMaster);
    }

    @PostMapping("/update")
    public Response update(@RequestBody ProductsMaster productsMaster) throws ServiceException, IOException, ExecutionException, InterruptedException {
        return productsService.update(productsMaster);
    }

    @GetMapping("/getByName")
    public Response getByName(@RequestParam String name) throws ServiceException, IOException, ExecutionException, InterruptedException {
        ProductsMaster productsMaster = productsService.getByName(name);
        return new Response(ResponseConstants.SUCCESS, productsMaster, "User Fetched Successfully");

    }

    @GetMapping("/getAll")
    public Response getAll() throws IOException, ExecutionException, InterruptedException {
        List<ProductsMaster> productsMasterList = productsService.getAll();
        return new Response(ResponseConstants.SUCCESS, productsMasterList, "All Products fetched Successfully");
    }

    @GetMapping("/getAllEnabled")
    public Response getAllEnabled(){
        return productsService.getAllEnabled();
    }

    @PostMapping("/delete")
    public  Response delete(String name){
        return productsService.delete();
    }
}
