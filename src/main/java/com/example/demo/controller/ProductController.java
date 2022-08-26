package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> getEmployee() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product saveEmployee(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @PutMapping
    public Product updateEmployee(@RequestBody Product product) {
        if (product != null && !product.getId().isEmpty())
            return productRepository.save(product);
        return null;
    }

    @DeleteMapping
    public void deleteEmployee(@RequestBody Product product) {
        if (product != null && !product.getId().isEmpty()) {
            productRepository.delete(product);
        }
    }
}
