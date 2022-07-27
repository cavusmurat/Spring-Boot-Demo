package com.example.demo.project.dto.converter;

import com.example.demo.project.dto.CustomerDto;
import com.example.demo.project.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {

    public CustomerDto convertToCustomerDto(Customer from){
        CustomerDto customerDto = new CustomerDto();

        customerDto.setId(from.getId());
        customerDto.setName(from.getName());
        customerDto.setSurname(from.getSurname());
        customerDto.setCurrentPlan(from.getCurrentPlan());
        customerDto.setPhoneNumber(from.getPhoneNumber());

        return customerDto;

    }
}
