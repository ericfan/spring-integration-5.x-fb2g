package com.example.router.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RouteService {

    Logger logger = LoggerFactory.getLogger(RouteService.class);

    public void write(String str){
        logger.info("###########RouteChannel with value: " + str);
    }
}
