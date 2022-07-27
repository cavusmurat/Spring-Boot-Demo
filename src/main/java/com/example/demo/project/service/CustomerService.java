package com.example.demo.project.service;

import com.example.demo.project.dto.CustomerDto;
import com.example.demo.project.dto.PlanDto;
import com.example.demo.project.dto.converter.CustomerDtoConverter;
import com.example.demo.project.dto.converter.PlanDtoConverter;
import com.example.demo.project.model.Customer;
import com.example.demo.project.model.Plan;
import com.example.demo.project.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerDtoConverter customerDtoConverter;


    public CustomerService(CustomerRepository customerRepository, CustomerDtoConverter customerDtoConverter) {
        this.customerRepository = customerRepository;
        this.customerDtoConverter = customerDtoConverter;

    }

    public List<CustomerDto> getAllCustomers(){
        return customerRepository.findAll()
                .stream()
                .map(customerDtoConverter::convertToCustomerDto)
                .collect(Collectors.toList());
    }

    public CustomerDto getCustomerById(Long customerId){
        return new CustomerDto(

        );
    }

    public Plan findMyCustomer(String phoneNumber){
        return customerRepository.findByPhoneNumber(phoneNumber).getCurrentPlan();
    }




}
