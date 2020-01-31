package com.example.fb2g.aggregator;

import com.example.fb2g.bean.IntBean;
import com.example.fb2g.bean.ResponseBean;
import com.example.fb2g.bean.SampleBean;
import com.example.fb2g.bean.StringBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class SearchResultAggregator {

    public List<ResponseBean> aggregate(Collection<Object> results) {
        List<ResponseBean> resList = new ArrayList<>();
        for (Object result : results) {
            ResponseBean bean = new ResponseBean();
            if (result instanceof IntBean) {
                bean.setResNum(((IntBean) result).getResNum());
            } else if (result instanceof StringBean) {
                bean.setResStr(((StringBean) result).getResStr());
            }
            resList.add(bean);
        }
        return resList;
    }
}
