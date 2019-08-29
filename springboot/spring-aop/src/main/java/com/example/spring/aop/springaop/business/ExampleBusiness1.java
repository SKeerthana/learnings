package com.example.spring.aop.springaop.business;

import com.example.spring.aop.springaop.aspect.TrackTime;
import com.example.spring.aop.springaop.data.AopDao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleBusiness1 {
    @Autowired
    private AopDao1 aopDao1;

    @TrackTime
    public String calculate() {
        return aopDao1.retrieveData();
    }
}
