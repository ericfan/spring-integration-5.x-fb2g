package com.example.jmx;

import com.example.jmx.service.SIWrapperService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:jmx-config.xml")
public class JMXApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JMXApplication.class, args);
        SIWrapperService siWrapperService = context.getBean(SIWrapperService.class);
        siWrapperService.processText("Wait>>>>>");
        siWrapperService.processText("Wait Again>>>>>");
    }

}
