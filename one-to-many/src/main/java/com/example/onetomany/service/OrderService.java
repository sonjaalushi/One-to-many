package com.example.onetomany.service;

import com.example.onetomany.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Service
public class OrderService {

    private Customer customer;
}
