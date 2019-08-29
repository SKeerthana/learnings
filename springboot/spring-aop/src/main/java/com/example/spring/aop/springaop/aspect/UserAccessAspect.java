package com.example.spring.aop.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.example.spring.aop.springaop..*.*(..))")
    public void before(JoinPoint joinPoint){
        logger.info("Intercepted Method calls - {}", joinPoint);
    }
}
