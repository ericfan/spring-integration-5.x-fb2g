package com.example.enricher.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author lei.fan
 */
@Service
public class DefaultService {

    Logger logger = LoggerFactory.getLogger(DefaultService.class);

    public void write(String str) {
        logger.info("###########DefaultChannel with value: " + str);
    }
}
