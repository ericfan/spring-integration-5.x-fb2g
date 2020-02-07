package com.example.router.integration;

import com.example.router.service.DefaultService;
import com.example.router.service.RouteService;
import com.example.router.service.SIWrapperService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.ArgumentMatchers.anyString;

/**
 * @author lei.fan
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class GenericRouterIntegrationTest {

    @SpyBean
    private DefaultService defaultService;

    @SpyBean
    private RouteService routeService;

    @Autowired
    private SIWrapperService siWrapperService;

    @Test
    public void testSuccess(){
        siWrapperService.processText("DEFAULT");
        Mockito.verify(defaultService, Mockito.times(1)).write(anyString());
        siWrapperService.processText("REST");
        Mockito.verify(routeService, Mockito.times(1)).write(anyString());
    }
}
