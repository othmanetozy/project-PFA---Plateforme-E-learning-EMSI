package com.Elearning.securite;

import com.Elearning.entities.User;
import com.Elearning.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {

    private final UserRepository repo;

    @Bean
    public UserDetailsService userDetailsService() {
        return username -> {
            User user = repo.findByEmail(username)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            // Assuming User implements UserDetails
            return (UserDetails) user;
        };
    }
}
