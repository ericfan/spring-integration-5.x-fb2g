package com.example.router.component.routers;

import com.example.router.service.DefaultService;
import com.example.router.service.RouteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.ArgumentMatchers.anyString;

/**
 * @author lei.fan
 */
@ContextConfiguration
@RunWith(SpringRunner.class)
public class PojoGenericRouterComponentTest {

    @Autowired
    private MessageChannel inChannel;

    @Autowired
    private MessageChannel defaultChannel;

    @MockBean(name = "defaultService")
    private DefaultService defaultService;

    @MockBean(name = "routeService")
    private RouteService routeService;

    @Test
    public void testDefaultChannel() {
        Message message = MessageBuilder.withPayload("DEFAULT").build();
        inChannel.send(message);
        Mockito.verify(defaultService, Mockito.times(1)).write(anyString());
    }

    @Test
    public void testRouterChannel(){
        Message message = MessageBuilder.withPayload("REST").build();
        inChannel.send(message);
        Mockito.verify(routeService, Mockito.times(1)).write(anyString());
    }
}
