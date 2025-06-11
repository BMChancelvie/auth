package com.micro_service.auth.gateway_service;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import java.util.function.Predicate;

@Component
public class RouterValidator {
    public Predicate<ServerHttpRequest> isSecured = request ->
        !request.getURI().getPath().contains("/auth"); // Exemple de règle
}