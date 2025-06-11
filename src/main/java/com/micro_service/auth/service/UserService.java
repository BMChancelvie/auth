package com.micro_service.auth.service;

import com.micro_service.auth.model.User;

public interface UserService {

    User getUserByEmail(String email);
}