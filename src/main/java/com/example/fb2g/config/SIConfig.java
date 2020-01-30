package com.example.fb2g.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:sampleflow-config.xml")
@EnableAutoConfiguration
public class SIConfig {

}
