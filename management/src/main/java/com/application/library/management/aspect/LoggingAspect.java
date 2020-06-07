package com.application.library.management.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.application.library.management.service.SearchService.*(..))")
    public void memoryOperations() {

    }

    @Before(value = "memoryOperations()")
    public void beforeLog(JoinPoint joinPoint) {
        System.out.println("Memory Operations are about to be performed on : " + joinPoint.getTarget().getClass().getSimpleName());
    }

    @After(value = "memoryOperations()")
    public void afterLog(JoinPoint joinPoint) {
        System.out.println("Memory Operations are performed on : " + joinPoint.getTarget().getClass().getSimpleName());
    }
}
