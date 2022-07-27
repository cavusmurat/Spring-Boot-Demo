package com.example.demo.project.dto.converter;

import com.example.demo.project.dto.PlanDto;
import com.example.demo.project.model.Plan;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PlanDtoConverter {

    public PlanDto convertToPlanDto (Plan from){
        PlanDto planDto = new PlanDto();

        planDto.setId(from.getId());
        planDto.setName(from.getName());
        planDto.setType(from.getType());
        planDto.setDescription(from.getDescription());
        planDto.setPrice(from.getPrice());
        planDto.setCustomers(from.getCustomers());
        planDto.setItems(from.getItems());
        planDto.setPurchaseDate(from.getPurchaseDate());
        planDto.setExpireDate(from.getExpireDate());

        return planDto;
    }
}
