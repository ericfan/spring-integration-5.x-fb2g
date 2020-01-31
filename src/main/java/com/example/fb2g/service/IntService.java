package com.example.fb2g.service;

import com.example.fb2g.bean.SampleBean;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class IntService {
    public SampleBean getEmp(Integer i) {
        SampleBean bean = new SampleBean();
        if (NumberUtils.compare(10, i) > 0) {
            bean.setAge(i);
            bean.setName("int");
            bean.setDate(LocalDate.now());
        }
        return bean;
    }
}
