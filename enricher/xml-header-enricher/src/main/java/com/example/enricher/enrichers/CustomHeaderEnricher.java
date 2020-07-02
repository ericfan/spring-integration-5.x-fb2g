package com.example.enricher.enrichers;

import org.springframework.integration.transformer.support.AbstractHeaderValueMessageProcessor;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class CustomHeaderEnricher extends AbstractHeaderValueMessageProcessor {

    @Override
    public Object processMessage(Message message) {
        Message outputMsg = MessageBuilder
                .fromMessage(message)
                .setHeader("1", "test")
                .build();
        return outputMsg;
    }
}
