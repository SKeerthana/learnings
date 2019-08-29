package com.example.spring.aop.springaop.data;

import com.example.spring.aop.springaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class AopDao {
    @TrackTime
    public String retrieveData(){
        return "AopDao";
    }
}
