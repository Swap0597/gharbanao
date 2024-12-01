package com.gharbanao.coreentities.productDetails;

import com.gharbanao.responses.Response;
import com.gharbanao.responses.ResponseConstants;
import com.gharbanao.serviceException.ServiceException;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/productDetails")
public class ProductDetailsEndpoint {
    ProductDetailsService productDetailsService;

    public ProductDetailsEndpoint(ProductDetailsService productDetailsService){
        this.productDetailsService = productDetailsService;
    }

    @PostMapping("/create")
    public Response create(@RequestBody ProductDetailsMaster productDetailsMaster) throws ServiceException {
        return productDetailsService.create(productDetailsMaster);
    }

    @GetMapping("/get")
    public Response create(@RequestParam String category) throws IOException, ExecutionException, InterruptedException {
        List<ProductDetailsMaster> productDetailsMaster = productDetailsService.get(category);
        return new Response(ResponseConstants.SUCCESS, productDetailsMaster, "Product Fetched Successfully");
    }

    @PostMapping("/update")
    public Response update(@RequestBody ProductDetailsMaster productDetailsMaster){
        return productDetailsService.update(productDetailsMaster);
    }

    @PostMapping("/enable")
    public Response enable(@RequestParam String name){
        return productDetailsService.enable(name);
    }

    @PostMapping("/disable")
    public Response disable(@RequestParam String name){
        return productDetailsService.disable(name);
    }
}
