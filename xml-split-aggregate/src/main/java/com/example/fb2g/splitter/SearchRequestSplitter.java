package com.example.fb2g.splitter;

import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;

@Component
public class SearchRequestSplitter extends AbstractMessageSplitter {

    @Override
    protected Object splitMessage(Message<?> message) {
        return Arrays.asList("a", "b", "c", 1, 2);
    }

    @Override
    protected void addHeaders(Message<?> message, Map<String, Object> headers) {
        headers.put("customAttr", "CustomHeader");
    }

    @Override
    protected boolean willAddHeaders(Message<?> message) {
        return true;
    }
}
