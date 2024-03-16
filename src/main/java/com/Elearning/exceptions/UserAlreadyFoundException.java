package com.Elearning.exceptions;

public class UserAlreadyFoundException extends RuntimeException{
    public UserAlreadyFoundException() {
        super();
    }

    public UserAlreadyFoundException(String message) {
        super(message);
    }

    public UserAlreadyFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserAlreadyFoundException(Throwable cause) {
        super(cause);
    }

    protected UserAlreadyFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
