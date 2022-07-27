package com.example.demo.project.controller;

import com.example.demo.project.dto.CreateLoginRequest;
import com.example.demo.project.dto.CustomerDto;
import com.example.demo.project.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    /*@PostMapping("/login")
    public ResponseEntity<CustomerDto> login(@Valid @RequestBody CreateLoginRequest request){

        return null;
    }*/


}
