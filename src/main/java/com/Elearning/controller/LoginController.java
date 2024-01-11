package com.Elearning.controller;

import com.Elearning.config.ResourcesPath;
import com.Elearning.dto.LoginDto;
import com.Elearning.service.LoginService;
import com.Elearning.service.imp.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("api")
    public ResponseEntity<?> creatUser(@RequestBody LoginDto loginDto)
    {
        System.out.println("Testttttt");
        LoginDto creatUser = loginService.createUser(loginDto);
        if (creatUser == null){
        return new ResponseEntity<>("Utilisateur non enregistrer",HttpStatus.BAD_REQUEST);}
        return new ResponseEntity<>(creatUser,HttpStatus.CREATED);
    }
}
