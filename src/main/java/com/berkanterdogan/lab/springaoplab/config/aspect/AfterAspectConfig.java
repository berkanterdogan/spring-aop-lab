package com.berkanterdogan.lab.springaoplab.config.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class AfterAspectConfig {

    @After("com.berkanterdogan.lab.springaoplab.config.aspect.BaseJoinPointConfig.pointcutForServiceOrSubPackages()")
    public void afterForServicePackageOrSubPackages(JoinPoint joinPoint) {
        log.info("@After - service package or its sub-packages - Intercepted Method Calls - {}", joinPoint);

    }

    @AfterReturning(
        value = "com.berkanterdogan.lab.springaoplab.config.aspect.BaseJoinPointConfig.pointcutForServiceOrSubPackages()",
        returning = "result"
    )
    public void afterReturningForServicePackageOrSubPackages(JoinPoint joinPoint, Object result) {
        log.info("@AfterReturning - service package or its sub-packages - Intercepted Method Calls - {}", joinPoint);
    }

    @AfterThrowing(
        value = "com.berkanterdogan.lab.springaoplab.config.aspect.BaseJoinPointConfig.pointcutForServiceOrSubPackages()",
        throwing = "exception"
    )
    public void afterThrowingForServicePackageOrSubPackages(JoinPoint joinPoint, Throwable exception) {
        log.info("@AfterThrowing - service package or its sub-packages - Intercepted Method Calls - {}", joinPoint);
    }
}
