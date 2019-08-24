package com.mw.Study.diveiinspringboot.bootstrp;

import com.mw.Study.diveiinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/***
 * 模式注解
 */
@ComponentScan("com.mw.Study.diveiinspringboot.repository")
public class RepositoryBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        //myFirstLevelRepository是否存在
        MyFirstLevelRepository myFirstLevelRepository
                = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        String helloWorld
                = context.getBean("helloWorld", String.class);

        System.out.println("myFirstLevelRepository:"+myFirstLevelRepository.toString());

        System.out.println("hello world:"+helloWorld);
        //关闭上下文
        context.close();
    }
}
