package com.micro_service.auth.dto;

public class AuthToken {
    private String token;

    public AuthToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}