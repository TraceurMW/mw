package com.mw.Study.springBoot.diveiinspringboot.bootstrp;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class EnableAutoConfigurationBootstrap {
    public static void main(String[] args) {
//        new SpringApplication

        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

//        //myFirstLevelRepository是否存在
//        MyFirstLevelRepository myFirstLevelRepository
//                = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        String helloWorld
                = context.getBean("helloWorld", String.class);
        System.out.println(helloWorld);
    }
}
