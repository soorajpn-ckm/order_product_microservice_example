package com.sooraj.product.rest;


import com.sooraj.product.domain.ProductStock;
import com.sooraj.product.repo.ProductStockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductStockController {

    @Autowired
    ProductStockRepo productStockRepo;

    @PostMapping("/create")
    public ProductStock create(@RequestBody ProductStock product){
        return  productStockRepo.save(product);

    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){

    }
    @PutMapping("/update")
    public ProductStock update(@RequestBody ProductStock product){

        return null;
    }
    @GetMapping("/findById/{}")
    public ProductStock create(@PathVariable Integer id){

        return productStockRepo.findById(id).get();
    }
}
