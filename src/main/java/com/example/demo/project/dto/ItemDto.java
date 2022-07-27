package com.example.demo.project.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;



@Component
@Getter
@Setter
public class ItemDto {

    private Long id;
    private String name;
}
