package com.Elearning.repo;

import com.Elearning.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String>{
    Optional<User> findByEmail(String email);
}
