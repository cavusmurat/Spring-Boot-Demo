package com.example.demo.project.repository;

import com.example.demo.project.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository <Customer,Long>{
}
