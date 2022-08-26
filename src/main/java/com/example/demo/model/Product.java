package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
public class Product {

    @Id
    private String id;
    private String name;
    private Double quantity;
    private Double price;

    @DBRef
    @JsonManagedReference
    private List<Category> categories;

}
