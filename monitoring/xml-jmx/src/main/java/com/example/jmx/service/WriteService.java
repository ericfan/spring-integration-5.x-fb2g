package com.example.jmx.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WriteService {

    Logger logger = LoggerFactory.getLogger(WriteService.class);

    public void write(String str){
        logger.info("###########Hello JMX: " + str);
    }
}
