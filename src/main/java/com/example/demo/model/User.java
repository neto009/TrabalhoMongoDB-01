package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@Document(collection = "order")
public class User {

    @Id
    private String id;
    private String name;

    private List<Product> productList;
    private Address address;
}
