package com.example.demo.project.repository;


import com.example.demo.project.model.Customer;
import com.example.demo.project.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Long>{

    Customer findByPhoneNumber(String phoneNumber);
}
