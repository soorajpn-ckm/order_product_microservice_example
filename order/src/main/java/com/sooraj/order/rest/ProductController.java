package com.sooraj.order.rest;

import com.sooraj.order.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sooraj.order.domain.*;

@RestController
@RequestMapping("/api/product")

public class ProductController {

    @Autowired
    ProductRepo productRepo;



    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return  productRepo.save(product);

    }


}
