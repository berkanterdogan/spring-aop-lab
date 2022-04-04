package com.berkanterdogan.lab.springaoplab.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExecutionTimeTracker {

    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";
}
