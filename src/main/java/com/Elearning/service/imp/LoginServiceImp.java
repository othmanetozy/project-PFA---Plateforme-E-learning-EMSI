package com.Elearning.service.imp;

import com.Elearning.entities.User;
import com.Elearning.repo.UserRepo;
import com.Elearning.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImp implements LoginService {

    private final UserRepo userRep;

    @Autowired
    public LoginServiceImp(UserRepo userRepo) {
        this.userRep = userRepo;
    }

    @Override
    public Boolean authenticate(String username, String password) {
        Optional<User> optionalUser = userRep.findByUsername(username);

        return optionalUser.map(user -> user.getPassword().equals(password)).orElse(false);
    }
}
