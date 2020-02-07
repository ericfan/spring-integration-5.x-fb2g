package com.example.router.routers;

import org.springframework.integration.annotation.Router;
import org.springframework.stereotype.Component;

/**
 * @author lei.fan
 */
@Component
public class PojoGenericRouter {

    @Router
    public String route(String input) {
        if (input.toLowerCase().contains("r")) {
            return "routeChannel";
        }
        return "defaultChannel";
    }
}
