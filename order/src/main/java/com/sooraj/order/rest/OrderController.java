package com.sooraj.order.rest;

import com.sooraj.order.domain.Order;
import com.sooraj.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderRepo orderRepo;

    @PostMapping("/create")
    public Order createOrder(@RequestBody Order order){
        //order.getProducts().forEach(product -> product.setOrder(order));
        return  orderRepo.save(order);
    }
    @PutMapping("/update")
    public Order updateOrder(@RequestBody Order order){
       // order.getProducts().forEach(product -> product.setOrder(order));
        return  orderRepo.save(order);
    }
    @GetMapping("/findById/{id}")
    public Order findOrderById(@PathVariable Integer id){
     return  orderRepo.findById(id).get();

    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteOrder(@PathVariable Integer id){
         orderRepo.deleteById(id);

    }
    @GetMapping("/test")
    public String test(){
        return  "helo world";

    }


}
