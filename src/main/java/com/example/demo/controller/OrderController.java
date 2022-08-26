package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping
    public List<User> getEmployee() {
        return orderRepository.findAll();
    }

    @PostMapping
    public User saveEmployee(@RequestBody User user) {
        return orderRepository.save(user);
    }

    @PutMapping
    public User updateEmployee(@RequestBody User user) {
        if (user != null && !user.getId().isEmpty())
            return orderRepository.save(user);
        return null;
    }

    @DeleteMapping
    public void deleteEmployee(@RequestBody User user) {
        if (user != null && !user.getId().isEmpty()) {
            orderRepository.delete(user);
        }
    }
}
