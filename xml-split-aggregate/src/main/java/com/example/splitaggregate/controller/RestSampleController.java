package com.example.splitaggregate.controller;

import com.example.splitaggregate.bean.SampleBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class RestSampleController {

    @GetMapping("/sample")
    public SampleBean get() {
        SampleBean bean = new SampleBean();
        bean.setAge(18);
        bean.setName("Eric");
        bean.setDate(LocalDate.now());
        return bean;
    }
}
