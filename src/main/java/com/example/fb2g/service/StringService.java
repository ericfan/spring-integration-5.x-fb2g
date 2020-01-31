package com.example.fb2g.service;

import com.example.fb2g.bean.SampleBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StringService {

    public SampleBean getEmp(String str){
        SampleBean bean = new SampleBean();
        if(StringUtils.isAlpha(str)){
            bean.setAge(21);
            bean.setName(str);
            bean.setDate(LocalDate.now());
        }
        return bean;
    }
}
