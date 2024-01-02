package com.Elearning.service;

public interface LoginService {

    static String authenticateStatic(String username, String password) {
        return null;
    }

    Boolean authenticate(String username, String password);
}
