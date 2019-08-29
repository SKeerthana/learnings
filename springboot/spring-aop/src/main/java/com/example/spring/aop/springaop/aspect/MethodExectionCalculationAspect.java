package com.example.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExectionCalculationAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around(value="execution(* com.example.spring.aop.springaop.business.*.*(..))")

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        joinPoint.proceed();

        long endTime = System.currentTimeMillis() - startTime;
        logger.info("Time taken by {} is {}", joinPoint, endTime);
    }

}
