package com.mw.Study.springBoot.diveiinspringboot.configuration;

import com.mw.Study.springBoot.diveiinspringboot.annotation.EnableHelloWorld;
import com.mw.Study.springBoot.diveiinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/***
 * 自动装配
 */
@Configuration //Spring模式注解
@EnableHelloWorld //Spring @Enable 模块装配
@ConditionalOnSystemProperty(name="user.name",value = "TraceurMW") //条件装配
public class HelloWorldAutoConfiguration {
}
