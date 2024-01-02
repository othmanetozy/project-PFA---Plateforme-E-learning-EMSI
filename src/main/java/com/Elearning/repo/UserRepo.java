package com.Elearning.repo;

import com.Elearning.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRepo extends JpaRepository<User,Long> , JpaSpecificationExecutor<User> {

}
