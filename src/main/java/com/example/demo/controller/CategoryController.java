package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> getEmployee() {
        return categoryRepository.findAll();
    }

    @PostMapping
    public Category saveEmployee(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    @PutMapping
    public Category updateEmployee(@RequestBody Category category) {
        if (category != null && !category.getId().isEmpty())
            return categoryRepository.save(category);
        return null;
    }

    @DeleteMapping
    public void deleteEmployee(@RequestBody Category category) {
        if (category != null && !category.getId().isEmpty()) {
            categoryRepository.delete(category);
        }
    }
}
