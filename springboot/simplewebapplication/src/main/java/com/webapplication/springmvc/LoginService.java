package com.webapplication.springmvc;

import org.springframework.stereotype.Service;

@Service
class LoginService {
    boolean validateUser(String username, String password){
        return username.equals("kd") && password.equals("abcd");
    }
}
