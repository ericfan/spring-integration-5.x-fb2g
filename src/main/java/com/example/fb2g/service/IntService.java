package com.example.fb2g.service;

import com.example.fb2g.bean.IntBean;
import com.example.fb2g.bean.SampleBean;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class IntService {

    Logger logger = LoggerFactory.getLogger(IntService.class);

    @Async("threadPoolTaskExecutor")
    public Future<IntBean> getEmp(Integer i) throws InterruptedException {
        IntBean bean = new IntBean();
        Thread.sleep(100);
        logger.info("************ThreadId is {}, ThreadName is {}", Thread.currentThread().getId(), Thread.currentThread().getName());
        if (NumberUtils.compare(10, i) > 0) {
            bean.setReqNum(i);
            bean.setResNum(i + 10);
        }
        return new AsyncResult<>(bean);
    }
}
