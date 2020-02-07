package com.example.router.unit.routers;

import com.example.router.routers.PojoGenericRouter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

/**
 * {@link com.example.router.routers.PojoGenericRouter} unit test case.
 * @author lei.fan
 */
@RunWith(MockitoJUnitRunner.class)
public class PojoGenericRouterUnitTest {

    private PojoGenericRouter genericRouter = new PojoGenericRouter();

    @Test
    public void testRouteChannel(){
        assertEquals("routeChannel", genericRouter.route("REST"));
    }

    @Test
    public void testDefaultChannel(){
        assertEquals("defaultChannel", genericRouter.route("DEFAULT"));
    }
}
