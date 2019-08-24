package com.mw.Study.diveiinspringboot.bootstrp;

import com.mw.Study.diveiinspringboot.annotation.EnableHelloWorld;
import com.mw.Study.diveiinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/***
 * 组合装配
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

//        //myFirstLevelRepository是否存在
//        MyFirstLevelRepository myFirstLevelRepository
//                = context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);
        String helloWorld
                = context.getBean("helloWorld", String.class);

//        System.out.println("myFirstLevelRepository:"+myFirstLevelRepository.toString());

        System.out.println("hello world:"+helloWorld);
        //关闭上下文
        context.close();
    }
}
