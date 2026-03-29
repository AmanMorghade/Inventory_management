package com.example.inventory.service;

import com.example.inventory.ProductRepo;
import com.example.inventory.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

//    ProductModel pm = new ProductModel(101,1000,2,"mouse","electronic");

    @Autowired
    ProductRepo repo;
    public List<ProductModel> msg() {
        return repo.findAll();
    }

    public void addProduct(ProductModel data) {
        repo.save(data);
    }

    public ProductModel searchProduct(int prodId) {

        return repo.findById(prodId).orElse(null);
    }

    public void deleteProduct(int prod_id) {
        
        repo.deleteById(prod_id);
    }

    public void updateProduct(ProductModel pm,int id) {
       ProductModel pro= repo.findById(id).orElse(null);

       if(pro != null) {
           pro.setId(pm.getId());
           pro.setName(pm.getName());
           pro.setPrice(pm.getPrice());
           pro.setQuantity(pm.getQuantity());
           pro.setCategory(pm.getCategory());
           System.out.println(pm.getId() + " " + pm.getPrice());
            repo.save(pro);
       }
    }
}
