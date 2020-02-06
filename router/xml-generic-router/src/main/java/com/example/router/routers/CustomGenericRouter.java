package com.example.router.routers;

import org.springframework.integration.router.AbstractMessageRouter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CustomGenericRouter extends AbstractMessageRouter {

    @Override
    protected Collection<MessageChannel> determineTargetChannels(Message<?> message) {
        return null;
    }
}
