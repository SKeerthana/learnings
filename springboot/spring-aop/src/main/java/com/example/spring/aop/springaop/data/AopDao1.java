package com.example.spring.aop.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class AopDao1 {
    public String retrieveData(){
        return "AopDao1";
    }
}
