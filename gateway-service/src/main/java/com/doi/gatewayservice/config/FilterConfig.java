package com.doi.gatewayservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
//@Configuration
public class FilterConfig {
//    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/users/**")
                        .filters(
                                f -> f.addRequestHeader("users-request", "users-request-header")
                                        .addResponseHeader("users-response", "users-response-header")
                        )
                        .uri("http://localhost:8081")
                )
                .route(r -> r.path("/news/**")
                        .filters(
                                f -> f.addRequestHeader("news-request", "news-request-header")
                                        .addResponseHeader("news-response", "news-response-header")
                        )
                        .uri("http://localhost:8082")
                )
                .build();
    }
}
