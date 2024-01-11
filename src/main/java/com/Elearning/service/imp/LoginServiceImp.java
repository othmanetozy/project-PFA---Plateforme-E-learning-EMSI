package com.Elearning.service.imp;

import com.Elearning.dto.LoginDto;
import com.Elearning.dto.UserDto;
import com.Elearning.entities.User;
import com.Elearning.repo.UserRepository;
import com.Elearning.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    private UserRepository userRep;

    @Override
    public LoginDto createUser(LoginDto loginDto) {
      User user = new User();
      user.setEmail(loginDto.getUsername());
      user.setUsername(loginDto.getPassword());
      user.setPassword(new BCryptPasswordEncoder().encode(loginDto.getPassword()));
      User createUser = userRep.save(user);
      UserDto userDto = new UserDto();
      userDto.setEmail(createUser.getEmail());
      userDto.setUsername(createUser.getUsername());
      userDto.setPassword(createUser.getPassword());
      return loginDto;
    }
}
