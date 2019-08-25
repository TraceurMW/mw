package com.mw.Study.springBoot.diveiinspringboot.bootstrp;

import com.mw.Study.springBoot.diveiinspringboot.condition.ConditionalOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/***
 * 条件装配
 */
public class ConditionalOnSystemPropertyBootstrap {

    @Bean
//    @ConditionalOnSystemProperty(name="user.name",value = "TraceurMW")
    public String helloWorld(){
        return "Hello MW";
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionalOnSystemPropertyBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld
                = context.getBean("helloWorld", String.class);
        System.out.println(helloWorld);
    }
}
