package com.example.fb2g.service;

import com.example.fb2g.bean.IntBean;
import com.example.fb2g.bean.StringBean;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WriteService {

    Logger logger = LoggerFactory.getLogger(WriteService.class);

    public Object getEmp(Object object) throws InterruptedException {
        logger.info("************ThreadId is {}, ThreadName is {}", Thread.currentThread().getId(), Thread.currentThread().getName());
        String str = object.toString();
        if (StringUtils.isAlpha(str)) {
            StringBean stringBean = new StringBean();
            stringBean.setReqStr(str);
            stringBean.setResStr(StringUtils.upperCase(str));
            return stringBean;
        } else if (NumberUtils.isDigits(str)) {
            IntBean intBean = new IntBean();
            intBean.setReqNum(Integer.parseInt(str));
            intBean.setResNum(Integer.parseInt(str) + 10);
            return intBean;
        } else {
            return null;
        }
    }
}
