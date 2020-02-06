package com.example.router.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DefaultService {

    Logger logger = LoggerFactory.getLogger(DefaultService.class);

    public void write(String str) {
        logger.info("###########DefaultChannel with value: " + str);
    }
}
