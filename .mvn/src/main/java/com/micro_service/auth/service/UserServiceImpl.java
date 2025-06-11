package com.micro_service.auth.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.micro_service.auth.model.User;
import com.micro_service.auth.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User getUserByEmail(String email) {

        return Optional.ofNullable(repository.findByEmail(email))
                .orElseThrow(() -> new RuntimeException("User with email is not found."));

    }
}