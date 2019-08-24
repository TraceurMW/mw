package com.mw.Study.diveiinspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String helloWorld(){
        return "hello 2018";
    }
}
