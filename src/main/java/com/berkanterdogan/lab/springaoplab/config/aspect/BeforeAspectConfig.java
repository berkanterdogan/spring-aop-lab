package com.berkanterdogan.lab.springaoplab.config.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class BeforeAspectConfig {

    @Before("com.berkanterdogan.lab.springaoplab.config.aspect.BaseJoinPointConfig.pointcutForServiceOrSubPackages()")
    public void beforeForServicePackageOrSubPackages(JoinPoint joinPoint) {
        log.info("@Before - service package or its sub-packages - Intercepted Method Calls - {}", joinPoint);
    }

    @Before("com.berkanterdogan.lab.springaoplab.config.aspect.BaseJoinPointConfig.pointcutForRepositoryOrSubPackages()")
    public void beforeForRepositoryPackageOrSubPackages(JoinPoint joinPoint) {
        log.info("@Before - repository package or its sub-packages - Intercepted Method Calls - {}", joinPoint);
    }

    @Before("com.berkanterdogan.lab.springaoplab.config.aspect.BaseJoinPointConfig.pointcutForServicePackageOrSubPackagesWithWithin()")
    public void beforeForServicePackageOrSubPackagesWithWithin(JoinPoint joinPoint) {
        log.info("@Before - service package or its sub-packages with Within - Intercepted Method Calls - {}", joinPoint);
    }

}
