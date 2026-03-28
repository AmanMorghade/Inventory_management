package com.example.inventory.service;

import com.example.inventory.ProductRepo;
import com.example.inventory.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    ProductModel pm = new ProductModel(101,1000,2,"mouse","electronic");;

    @Autowired
    ProductRepo repo;
    public List<ProductModel> msg() {
        return repo.findAll();
    }

    public void addProduct(ProductModel data) {
        repo.save(data);
    }
}
