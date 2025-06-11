package com.micro_service.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.micro_service.auth.service.UserService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import com.micro_service.auth.dto.AuthenticationRequest;
import com.micro_service.auth.model.User;
import com.micro_service.auth.util.CryptoUtils;
import com.micro_service.auth.dto.AuthToken;
import com.micro_service.auth.util.JwtTokenUtil;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final JwtTokenUtil jwtTokenUtil;

    @PostMapping(value = "/authenticate")
    public ResponseEntity<AuthToken> authenticateUser(
            @Valid @RequestBody AuthenticationRequest request
    ) {

        User user = userService.getUserByEmail(request.getEmail());

        var password = CryptoUtils.decrypt(user.getPassword());

        if (user.getPassword().equals(password)) {
            // generate token
            var token = jwtTokenUtil.generate(user, "ACCESS");

            return ResponseEntity.ok(new AuthToken(token));
        }

        return ResponseEntity.badRequest().build();
    }
}
