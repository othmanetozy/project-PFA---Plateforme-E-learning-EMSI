package com.Elearning.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "LOGIN")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;
}
