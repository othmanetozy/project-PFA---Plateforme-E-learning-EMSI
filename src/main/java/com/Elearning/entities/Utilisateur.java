package com.Elearning.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Utilisateur {
    @Id
    private int ID;
    private String username;
    private String email;
    private String password;

}
