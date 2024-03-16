package com.Elearning.controller;

import com.Elearning.config.ResourcesPath;
import com.Elearning.dto.CustomEntityResponse;
import com.Elearning.dto.LoginDto;
import com.Elearning.dto.auth.LoginRequest;
import com.Elearning.dto.auth.LoginResponse;
import com.Elearning.dto.auth.RegisterRequest;
import com.Elearning.service.LoginService;
import com.Elearning.service.imp.LoginServiceImp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(ResourcesPath.API_AUTH)
public class LoginController {
    public final LoginService service;

    @PostMapping(ResourcesPath.REGISTER)
    public CustomEntityResponse<LoginResponse> register(@RequestBody RegisterRequest request){
        return new CustomEntityResponse<>(service.register(request));
    }

    @PostMapping(ResourcesPath.LOGIN)
    public CustomEntityResponse<LoginResponse> register(@RequestBody LoginRequest request){
        return new CustomEntityResponse<>(service.authenticate(request));
    }
}
