package com.Elearning.service.imp;

import com.Elearning.dto.LoginDto;
import com.Elearning.dto.UserDto;
import com.Elearning.dto.auth.LoginRequest;
import com.Elearning.dto.auth.LoginResponse;
import com.Elearning.dto.auth.RegisterRequest;
import com.Elearning.entities.User;
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

//    @Override
//    public LoginDto createUser(LoginDto loginDto) {
//      User user = new User();
//      user.setEmail(loginDto.getUsername());
//      user.setUsername(loginDto.getPassword());
//      user.setPassword(new BCryptPasswordEncoder().encode(loginDto.getPassword()));
//      User createUser = userRep.save(user);
//      UserDto userDto = new UserDto();
//      userDto.setEmail(createUser.getEmail());
//      userDto.setUsername(createUser.getUsername());
//      userDto.setPassword(createUser.getPassword());
//      return loginDto;
//    }

//    @Override
//    public LoginDto createUser(LoginDto loginDto) {
//        return null;
//    }

    @Override
    public LoginResponse register(RegisterRequest request) {
        User user= User
                .builder()
                .username(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .build();
        this.repository.save(user);
        final String jwtToken=this.jwtService.generateToken((UserDetails) user);
        return LoginResponse.builder()
                .token(jwtToken)
                .build();
    }

    @Override
    public LoginResponse authenticate(LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        final User user = this.repository.findByEmail(request.getEmail())
                .orElseThrow();
        final String jwtToken = jwtService.generateToken((UserDetails) user);
        return LoginResponse.builder()
                .token(jwtToken)
                .build();
    }
}
