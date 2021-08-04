package com.example.onetomany.repository;

import com.example.onetomany.entity.Customer;
import com.example.onetomany.service.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT new com.example.onetomany.service.OrderResponse (c.name,p.product_name) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinedInformation();
}
