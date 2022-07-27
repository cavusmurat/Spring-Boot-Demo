package com.example.demo.project.controller;

import com.example.demo.project.dto.PlanDto;
import com.example.demo.project.service.PlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PlanController {

    private final PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping("/displayPlans")
    public ResponseEntity<List<PlanDto>> displayPlans(){
        return ResponseEntity.ok(planService.displayPlans());
    }

    @GetMapping("/displayMyPlan/{phoneNumber}")
    public ResponseEntity<PlanDto> displayMyPlan (@PathVariable("phoneNumber") String phoneNumber){
        return ResponseEntity.ok(planService.displayMyPlan(phoneNumber));
    }
}
