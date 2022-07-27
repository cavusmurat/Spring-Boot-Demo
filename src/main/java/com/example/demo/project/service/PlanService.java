package com.example.demo.project.service;

import com.example.demo.project.dto.PlanDto;
import com.example.demo.project.dto.converter.PlanDtoConverter;
import com.example.demo.project.model.Customer;
import com.example.demo.project.model.Plan;
import com.example.demo.project.repository.PlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlanService {

    private final PlanRepository planRepository;
    private final PlanDtoConverter planDtoConverter;
    private final CustomerService customerService;

    public PlanService(PlanRepository planRepository, PlanDtoConverter planDtoConverter, CustomerService customerService) {
        this.planRepository = planRepository;
        this.planDtoConverter = planDtoConverter;
        this.customerService = customerService;
    }

    public List<PlanDto> displayPlans(){
        return planRepository.findAll()
                .stream()
                .map(planDtoConverter::convertToPlanDto)
                .collect(Collectors.toList());
    }

    public PlanDto displayMyPlan(String phoneNumber){
        return planDtoConverter.convertToPlanDto(planRepository.findById(customerService.findMyCustomer(phoneNumber)
                .getId()).get());
    }


}
