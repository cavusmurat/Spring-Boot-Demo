package com.example.demo.project.dto;

import com.example.demo.project.model.Plan;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
@Setter
public class CustomerDto {

    private Long id;
    private String name;
    private String surname;
    private String phoneNumber;
    private String password;
    private Plan currentPlan;

}
