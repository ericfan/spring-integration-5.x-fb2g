package com.example.fb2g.service;

import com.example.fb2g.bean.SampleBean;
import com.example.fb2g.bean.StringBean;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StringService {

    Logger logger = LoggerFactory.getLogger(StringService.class);

    public StringBean getEmp(String str){
        StringBean bean = new StringBean();
        logger.info("*********ThreadId is {}, ThreadName is {}", Thread.currentThread().getId(), Thread.currentThread().getName());
        if(StringUtils.isAlpha(str)){
            bean.setReqStr(str);
            bean.setResStr(StringUtils.upperCase(str));
        }
        return bean;
    }
}
