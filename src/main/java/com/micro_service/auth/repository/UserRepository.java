package com.micro_service.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro_service.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
