package com.example.inventory.controller;

import com.example.inventory.model.ProductModel;
import com.example.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    ProductService ps;


    @GetMapping("/")
    public List<ProductModel> allProduct(){
        return ps.msg();
    }

    @PostMapping("/")
    public void addProduct(@RequestBody ProductModel pm){
         ps.addProduct(pm);
    }
}
