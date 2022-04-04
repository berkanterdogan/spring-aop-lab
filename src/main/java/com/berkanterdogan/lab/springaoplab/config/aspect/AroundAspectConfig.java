package com.berkanterdogan.lab.springaoplab.config.aspect;

import com.berkanterdogan.lab.springaoplab.annotation.ExecutionTimeTracker;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Aspect
@Configuration
public class AroundAspectConfig {

    @Around("com.berkanterdogan.lab.springaoplab.config.aspect.BaseJoinPointConfig.pointcutForBeanEndsWithRepository()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = proceedingJoinPoint.proceed();

        long executionTimeMs = System.currentTimeMillis() - startTime;

        log.info("@Around for bean(*Repository) - {} was executed in {} ms", proceedingJoinPoint, executionTimeMs);

        return result;
    }

    @Around("com.berkanterdogan.lab.springaoplab.config.aspect.BaseJoinPointConfig.pointcutForExecutionTimeTrackerAnnotation(executionTimeTracker)")
    public Object aroundWithTrackTimeAnnotation(ProceedingJoinPoint proceedingJoinPoint, ExecutionTimeTracker executionTimeTracker) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = proceedingJoinPoint.proceed();

        long executionTimeMs = System.currentTimeMillis() - startTime;

        log.info("@Around for ExecutionTimeTracker - {} was executed in {} ms", proceedingJoinPoint, executionTimeMs);

        return result;
    }
}
