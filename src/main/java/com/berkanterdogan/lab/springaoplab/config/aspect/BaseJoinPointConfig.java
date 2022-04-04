package com.berkanterdogan.lab.springaoplab.config.aspect;

import com.berkanterdogan.lab.springaoplab.annotation.ExecutionTimeTracker;
import org.aspectj.lang.annotation.Pointcut;

public class BaseJoinPointConfig {

    @Pointcut("execution(* com.berkanterdogan.lab.springaoplab.repository..*.*(..))")
    public void pointcutForRepositoryOrSubPackages() {
        // Do nothing, so this method is a definition for Pointcut.
    }

    @Pointcut("execution(* com.berkanterdogan.lab.springaoplab.service..*.*(..))")
    public void pointcutForServiceOrSubPackages() {
        // Do nothing, so this method is a definition for Pointcut.
    }

    @Pointcut("com.berkanterdogan.lab.springaoplab.config.aspect.BaseJoinPointConfig.pointcutForServiceOrSubPackages() && com.berkanterdogan.lab.springaoplab.config.aspect.BaseJoinPointConfig.pointcutForRepositoryOrSubPackages()")
    public void pointcutForServiceAndRepository() {
        // Do nothing, so this method is a definition for Pointcut.
    }

    @Pointcut("bean(*Repository)")
    public void pointcutForBeanEndsWithRepository() {
        // Do nothing, so this method is a definition for Pointcut.
    }

    @Pointcut("within(com.berkanterdogan.lab.springaoplab.service..*)")
    public void pointcutForServicePackageOrSubPackagesWithWithin() {
        // Do nothing, so this method is a definition for Pointcut.
    }

    @Pointcut("@annotation(executionTimeTracker)")
    public void pointcutForExecutionTimeTrackerAnnotation(ExecutionTimeTracker executionTimeTracker) {
        // Do nothing, so this method is a definition for Pointcut.
    }
}
