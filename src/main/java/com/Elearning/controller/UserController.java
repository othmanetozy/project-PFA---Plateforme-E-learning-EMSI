package com.Elearning.controller;

import com.Elearning.config.ResourcesPath;
import com.Elearning.dto.LoginDto;
import com.Elearning.service.LoginService;
import com.Elearning.service.imp.LoginServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ResourcesPath.API_USERS)
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

}
