package com.example.onetomany.controller;

import com.example.onetomany.entity.Customer;
import com.example.onetomany.repository.CustomerRepository;
import com.example.onetomany.repository.ProductRepository;
import com.example.onetomany.service.OrderResponse;
import com.example.onetomany.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderService orderService) {
        return customerRepository.save(orderService.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders() {
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinedInformation() {
        return customerRepository.getJoinedInformation();
    }
}
