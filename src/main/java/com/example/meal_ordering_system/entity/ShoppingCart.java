package com.example.meal_ordering_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ShoppingCart {
    private Integer id;
    private String name;
    private float price;
    private  Integer sums;

    public ShoppingCart() {
    }

    public ShoppingCart(Integer id, String name, float price, Integer sums) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.sums = sums;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getSums() {
        return sums;
    }

    public void setSums(Integer sums) {
        this.sums = sums;
    }
}
