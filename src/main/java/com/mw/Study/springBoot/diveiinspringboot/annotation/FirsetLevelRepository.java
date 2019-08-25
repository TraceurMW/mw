package com.mw.Study.springBoot.diveiinspringboot.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirsetLevelRepository {
    String value() default "";
}
