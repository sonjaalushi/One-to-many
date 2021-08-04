package com.example.onetomany.service;

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
public class OrderResponse {
    private String name;
    private String product_Name;
}
