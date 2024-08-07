package com.library.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Advice that runs before the execution of any method in BookService
    @Before("execution(* com.library.service.BookService.*(..))")
    public void logBefore() {
        System.out.println("Logging before method execution.");
    }

    // Advice that runs after the execution of any method in BookService
    @After("execution(* com.library.service.BookService.*(..))")
    public void logAfter() {
        System.out.println("Logging after method execution.");
    }
}
