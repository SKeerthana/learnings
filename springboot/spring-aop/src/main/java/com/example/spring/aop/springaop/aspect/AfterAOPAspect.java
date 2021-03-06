package com.example.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAOPAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(value="execution(* com.example.spring.aop.springaop.business.*.*(..))", returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("jointpoint - {}, Return value - {}", joinPoint, result);
    }

    @AfterThrowing(value="execution(* com.example.spring.aop.springaop.business.*.*(..))", throwing="exception")
    public void afterThrowing(JoinPoint joinPoint, Exception exception){
        logger.info("jointpoint - {}, Exception - {}", joinPoint, exception);
    }

    @After(value="execution(* com.example.spring.aop.springaop.business.*.*(..))")
    public void after(JoinPoint joinPoint) {
        logger.info("after execution of {}", joinPoint);
    }
}
