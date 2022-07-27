package com.example.demo.project.service;

import com.example.demo.project.dto.converter.CustomerDtoConverter;
import com.example.demo.project.repository.LoginRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private final LoginRepository loginRepository;
    private final CustomerDtoConverter converter;

    public LoginService(LoginRepository loginRepository, CustomerDtoConverter converter) {
        this.loginRepository = loginRepository;
        this.converter = converter;
    }


}
