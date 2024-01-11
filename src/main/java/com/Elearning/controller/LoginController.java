package com.Elearning.controller;

import com.Elearning.config.ResourcesPath;
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
public class LoginController {

    public final LoginService service;

    @PostMapping("/register")
    public ResponseEntity<LoginResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/Login")
    public ResponseEntity<LoginResponse> register(@RequestBody LoginRequest request){
        return ResponseEntity.ok(service.authenticate(request));
    }




   /* @PostMapping("api")
    public ResponseEntity<?> creatUser(@RequestBody LoginDto loginDto)
    {
        System.out.println("Testttttt");
        LoginDto creatUser = loginService.createUser(loginDto);
        if (creatUser == null){
        return new ResponseEntity<>("Utilisateur non enregistrer",HttpStatus.BAD_REQUEST);}
        return new ResponseEntity<>(creatUser,HttpStatus.CREATED);
    }*/
}
