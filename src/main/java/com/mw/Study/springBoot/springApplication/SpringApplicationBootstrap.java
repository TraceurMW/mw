package com.mw.Study.springBoot.springApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;


public class SpringApplicationBootstrap {
    public static void main(String[] args) {
        Set<String> sources = new HashSet<>();
        sources.add(ApplicationConfiguration.class.getName());
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = springApplication.run(args);
        ApplicationConfiguration bean = context.getBean(ApplicationConfiguration.class);
        System.out.println(bean);
    }
    @SpringBootApplication
    public static class ApplicationConfiguration{

    }
}
