package com.mw.Study.springBoot.diveiinspringboot.bootstrp;

import com.mw.Study.springBoot.diveiinspringboot.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/***
 * 条件装配
 */
@SpringBootApplication(scanBasePackages = "com.mw.Study.springBoot.diveiinspringboot.service")
public class CalculateServiceBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootstrap.class)
                .web(WebApplicationType.NONE).profiles("java7")
                .run(args);
        CalculateService calculateService
                = context.getBean(CalculateService.class);
        System.out.println("sum:"+calculateService.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
