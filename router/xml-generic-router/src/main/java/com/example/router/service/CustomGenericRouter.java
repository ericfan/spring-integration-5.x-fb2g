package com.example.router.service;

import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CustomGenericRouter extends AbstractMessageRouter {

    @Override
    protected Collection<MessageChannel> determineTargetChannels(Message<?> message) {
        return null;
    }


}
