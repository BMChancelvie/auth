package com.micro_service.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AuthenticationRequest {
    @Email
    private String email;

    @NotBlank
    private String password;

    // getters/setters
}