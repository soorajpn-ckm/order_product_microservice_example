package com.sooraj.product.rest;


import com.sooraj.product.domain.ProductStock;
import com.sooraj.product.repo.ProductStockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productStock")
public class ProductStockController {

    @Autowired
    ProductStockRepo productStockRepo;

    @PostMapping("/create")
    public ProductStock create(@RequestBody ProductStock product){
        return  productStockRepo.save(product);

    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id){
          productStockRepo.deleteById(id);
    }
    @PutMapping("/update")
    public ProductStock update(@RequestBody ProductStock product){

        return  productStockRepo.save(product);
    }
    @GetMapping("/findById/{id}")
    public ProductStock create(@PathVariable Integer id){
        System.out.println("Find by id : "+id);
        return productStockRepo.findById(id).get();
    }
}
