package com.example.fb2g.service;

import com.example.fb2g.bean.SampleBean;
import com.example.fb2g.bean.StringBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StringService {

    public StringBean getEmp(String str){
        StringBean bean = new StringBean();
        if(StringUtils.isAlpha(str)){
            bean.setReqStr(str);
            bean.setResStr(StringUtils.upperCase(str));
        }
        return bean;
    }
}
