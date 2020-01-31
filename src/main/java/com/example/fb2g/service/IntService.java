package com.example.fb2g.service;

import com.example.fb2g.bean.IntBean;
import com.example.fb2g.bean.SampleBean;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

@Service
public class IntService {

    public IntBean getEmp(Integer i) throws InterruptedException {
        IntBean bean = new IntBean();
        Thread.sleep(3000);
        if (NumberUtils.compare(10, i) > 0) {
            bean.setReqNum(i);
            bean.setResNum(i + 10);
        }
        return bean;
    }
}
