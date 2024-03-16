package com.Elearning.service.imp;

import com.Elearning.dto.LoginDto;
import com.Elearning.dto.UserDto;
import com.Elearning.dto.auth.LoginRequest;
import com.Elearning.dto.auth.LoginResponse;
import com.Elearning.dto.auth.RegisterRequest;
import com.Elearning.entities.User;
import com.Elearning.enums.Role;
import com.Elearning.exceptions.UserAlreadyFoundException;
import com.Elearning.repo.UserRepository;
import com.Elearning.securite.JwtService;
import com.Elearning.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImp implements LoginService {

    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository repository;

    private final AuthenticationManager authenticationManager;
    public LoginServiceImp(JwtService jwtService, PasswordEncoder passwordEncoder, UserRepository repository, AuthenticationManager authenticationManager) {
        this.jwtService = jwtService;
        this.passwordEncoder = passwordEncoder;
        this.repository = repository;
        this.authenticationManager = authenticationManager;
    }

    @Override
    public LoginResponse register(RegisterRequest registerRequest) {
        Optional<User> oldUser = this.repository.findByEmail(registerRequest.email());
        if(oldUser.isPresent()) throw new UserAlreadyFoundException("This email is already taken, please try another one");
        var user= User
                .builder()
                .firstname(registerRequest.firstname())
                .lastname(registerRequest.lastname())
                .email(registerRequest.email())
                .password(passwordEncoder.encode(registerRequest.password()))
                .role(Role.Client)
                .build();
        this.repository.save(user);
        var jwtToken=this.jwtService.generateToken(user);
        return LoginResponse.builder()
                .token(jwtToken)
                .build();
    }

    @Override
    public LoginResponse authenticate(LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.email(),
                        request.password()
                )
        );
        Optional<User> user = this.repository.findByEmail(request.email());
        if(user.isEmpty()) throw new UserAlreadyFoundException("This email is wrong, please try another one");
        final String jwtToken = jwtService.generateToken(user.get());
        return LoginResponse.builder()
                .token(jwtToken)
                .build();
    }
}
