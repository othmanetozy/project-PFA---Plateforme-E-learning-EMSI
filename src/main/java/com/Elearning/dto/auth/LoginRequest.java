package com.Elearning.dto.auth;

import lombok.*;


public record LoginRequest (
     String email,
     String password

){

}