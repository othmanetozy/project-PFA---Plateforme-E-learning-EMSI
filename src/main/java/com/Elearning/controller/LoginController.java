package com.Elearning.controller;

import com.Elearning.dto.LoginDto;
import com.Elearning.service.imp.LoginServiceImp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private final LoginServiceImp loginService;

    public LoginController(LoginServiceImp loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginAuthentication(@RequestBody LoginDto loginDto) {
        boolean isAuthenticated = loginService.authenticate(loginDto.getUsername(), loginDto.getPassword());
        if (isAuthenticated) {
            return ResponseEntity.ok("Authentication successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
        }
    }
}
