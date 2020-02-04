package com.example.fb2g.splitter;

import com.example.fb2g.bean.ReqScopeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SearchRequestSplitter extends AbstractMessageSplitter {

    @Autowired
    private ReqScopeBean reqScopeBean;

    @Override
    protected Object splitMessage(Message<?> message) {
        reqScopeBean.setSessionId(message.getHeaders().getId().toString());
        return Arrays.asList("a","b","c", 1, 2);
    }
}
