package com.Elearning.advices;

import com.Elearning.dto.CustomEntityResponse;
import com.Elearning.exceptions.UserAlreadyFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AuthAdvice {
    @ExceptionHandler(UserAlreadyFoundException.class)
    public CustomEntityResponse<String> handleUserAlreadyFound(UserAlreadyFoundException ex){
        return new CustomEntityResponse<>(
                true,
                ex.getMessage(),
                HttpStatus.BAD_REQUEST,
                null
        );
    }
}
