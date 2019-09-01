package com.webapplication.javaee;

class UserValidationService {
    boolean isUserValid(String username, String password){
        return username.equals("kd") && password.equals("abcd");
    }
}
