package com.example.inventory;

import com.example.inventory.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductModel,Integer> {
}
