package com.example.demo.project.controller;

import com.example.demo.project.dto.CustomerDto;
import com.example.demo.project.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getAllCustomers")
    public ResponseEntity<List<CustomerDto>> getAllCustomers(){
        return ResponseEntity.ok(customerService.getAllCustomers());
    }

    @GetMapping("/getCustomer/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable Long customerId){
        return ResponseEntity.ok(customerService.getCustomerById(customerId));
    }

    @GetMapping("/test")
    public String apiTest() {
        String message = "HELLO WORLD";
        return message;
    }



}
