package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private Double quantity;
    private Double price;

    private List<Product> productList;
    private Address address;
}
