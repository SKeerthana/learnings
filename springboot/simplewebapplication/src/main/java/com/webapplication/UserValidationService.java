package com.webapplication;

public class UserValidationService {
    public boolean isUserValid(String username, String password){
        return username.equals("kd") && password.equals("abcd");
    }
}
