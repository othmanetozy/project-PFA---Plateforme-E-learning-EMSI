package com.Elearning.service;

import com.Elearning.dto.LoginDto;
import com.Elearning.dto.auth.LoginRequest;
import com.Elearning.dto.auth.LoginResponse;
import com.Elearning.dto.auth.RegisterRequest;

public interface LoginService {
     LoginDto createUser(LoginDto loginDto);

     LoginResponse register(RegisterRequest request);

     LoginResponse authenticate(LoginRequest request);
}
