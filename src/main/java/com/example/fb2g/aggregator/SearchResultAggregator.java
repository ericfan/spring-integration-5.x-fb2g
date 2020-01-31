package com.example.fb2g.aggregator;

import com.example.fb2g.bean.SampleBean;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class SearchResultAggregator {

    public List<SampleBean> aggregate(Collection<SampleBean> result){
        return (List<SampleBean>) result;
    }
}
