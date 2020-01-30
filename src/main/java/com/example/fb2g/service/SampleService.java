package com.example.fb2g.service;

import com.example.fb2g.bean.SampleBean;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SampleService {

    public SampleBean getEmp(){
        SampleBean bean = new SampleBean();
        bean.setAge(21);
        bean.setName("Test");
        bean.setDate(LocalDate.now());
        return bean;
    }
}
