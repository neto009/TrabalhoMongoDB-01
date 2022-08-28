package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;

import javax.persistence.Id;
import java.util.List;

@Data
@NoArgsConstructor
public class Product {

    @Id
    private String id;
    private String name;
    private Integer quantity;
    private Double price;

    @DBRef
    @JsonManagedReference
    private List<Category> categories;

}
