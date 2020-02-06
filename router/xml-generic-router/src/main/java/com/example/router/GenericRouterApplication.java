package com.example.router;

import com.example.router.service.SIWrapperService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:generic-router-config.xml")
public class GenericRouterApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(GenericRouterApplication.class, args);
        SIWrapperService siWrapperService = context.getBean(SIWrapperService.class);
        siWrapperService.processText("rest");
        siWrapperService.processText("default");
    }

}
