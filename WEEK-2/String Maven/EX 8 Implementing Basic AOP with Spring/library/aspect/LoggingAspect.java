package com.library.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // Advice method to log before the execution of any method in service package
    @Before("execution(* com.library.service.*.*(..))")
    public void logBeforeMethod() {
        logger.info("A method in the service layer is about to be executed.");
    }

    // Advice method to log after the execution of any method in service package
    @After("execution(* com.library.service.*.*(..))")
    public void logAfterMethod() {
        logger.info("A method in the service layer has just finished executing.");
    }
}