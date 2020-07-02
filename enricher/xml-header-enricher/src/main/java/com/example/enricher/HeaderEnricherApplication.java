package com.example.enricher;

import com.example.enricher.service.SIWrapperService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:header-enricher-config.xml")
public class HeaderEnricherApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HeaderEnricherApplication.class, args);
        SIWrapperService siWrapperService = context.getBean(SIWrapperService.class);
        siWrapperService.processText("rest");
    }
}
