package com.example.demo.project.dto;

import com.example.demo.project.model.Customer;
import com.example.demo.project.model.Item;
import com.example.demo.project.model.PlanType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.util.List;

@Component
@Getter
@Setter
public class PlanDto {

    private Long id;
    private String name;
    private Double price;
    private LocalDateTime purchaseDate;
    private String description;
    private LocalDateTime expireDate;
    private PlanType type;
    private List<Customer> customers;
    private List<Item> items;

}
