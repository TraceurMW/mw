package com.mw.Study.diveiinspringboot.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
@FirsetLevelRepository
public @interface SecondLevelRepository {
    String value() default "";

}
