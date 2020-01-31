package com.example.fb2g.splitter;

import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SearchRequestSplitter extends AbstractMessageSplitter {

    @Override
    protected Object splitMessage(Message<?> message) {
        return Arrays.asList("a","b","c", 1, 2);
    }
}
