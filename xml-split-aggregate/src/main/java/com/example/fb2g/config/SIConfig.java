package com.example.fb2g.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ImportResource("classpath:sampleflow-config.xml")
@EnableAutoConfiguration
@EnableAsync
public class SIConfig {

}
