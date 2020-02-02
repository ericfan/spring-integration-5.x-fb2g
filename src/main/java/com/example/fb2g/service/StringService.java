package com.example.fb2g.service;

import com.example.fb2g.bean.StringBean;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class StringService {

    Logger logger = LoggerFactory.getLogger(StringService.class);

    @Async("threadPoolTaskExecutor")
    public Future<StringBean> getEmp(String str) throws InterruptedException {
        StringBean bean = new StringBean();
        Thread.sleep(400);
        logger.info("************ThreadId is {}, ThreadName is {}", Thread.currentThread().getId(), Thread.currentThread().getName());
        if(StringUtils.isAlpha(str)){
            bean.setReqStr(str);
            bean.setResStr(StringUtils.upperCase(str));
        }
        return new AsyncResult<>(bean);
    }
}
