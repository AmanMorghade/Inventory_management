package com.example.inventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductModel {

    @Id
    private int id;
    private int price,quantity;
    private String name,category;

    public ProductModel(){}
    public ProductModel(int id, int price, int quantity, String name, String category) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
