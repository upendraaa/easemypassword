package com.example.easemypassword.extra;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * the endpoint can be access like
 * http://localhost:8080/actuator/customEndpoint
 */
@Endpoint(id="customEndpoint")
@Component
public class CustomActuatorEndpoint {

    @ReadOperation
    @Bean
    public String hi() {
        return "Hi from custom endpoint";
    }
}
