package com.example.spring.aop.springaop.business;

import com.example.spring.aop.springaop.data.AopDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleBusiness {
    @Autowired
    private AopDao aopDao;

    public String calculate() {
        return aopDao.retrieveData();
    }
}
