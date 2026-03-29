package com.example.inventory.controller;

import com.example.inventory.ProductRepo;
import com.example.inventory.model.ProductModel;
import com.example.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/product")
@RestController
public class controller {

    @Autowired
    ProductService ps;

    @Autowired
    ProductRepo repo;


    @GetMapping("")
    public List<ProductModel> allProduct(){
        return ps.msg();
    }

    @PostMapping("")
    public void addProduct(@RequestBody ProductModel pm){
         ps.addProduct(pm);
    }

    @GetMapping("/{prod_id}")
    public ProductModel searchProduct(@PathVariable int prod_id){
        return ps.searchProduct(prod_id);
    }

    @DeleteMapping("/{prod_id}")
    public void deleteProduct(@PathVariable int prod_id){
        ps.deleteProduct(prod_id);
    }

    @PutMapping("/{prod_id}")
    public void updateProduct(@RequestBody ProductModel pm,@PathVariable int prod_id){
        ps.updateProduct(pm,prod_id);
    }
}
