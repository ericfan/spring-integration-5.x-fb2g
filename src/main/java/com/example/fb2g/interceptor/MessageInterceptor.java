package com.example.fb2g.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptor;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class MessageInterceptor implements ChannelInterceptor {

    Logger logger = LoggerFactory.getLogger(MessageInterceptor.class);

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        logger.info("sequenceNumber is {}", message.getHeaders().get("sequenceNumber").toString());
        logger.info("correlationId is {}", message.getHeaders().get("correlationId").toString());
        logger.info("payload is {}", message.getPayload());
        return message;
    }

    @Override
    public void afterSendCompletion(Message<?> message, MessageChannel channel, boolean sent, Exception ex) {

    }

    @Override
    public Message<?> postReceive(Message<?> message, MessageChannel channel) {
        return message;
    }
}
