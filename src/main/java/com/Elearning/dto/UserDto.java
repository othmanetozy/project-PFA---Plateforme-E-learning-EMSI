package com.Elearning.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Integer id;

    private String username;

    private String email;

    private String passrowd;

    private String phoneNumber;
}