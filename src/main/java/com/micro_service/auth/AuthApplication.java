package com.micro_service.auth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

	@Bean
    public CommandLineRunner keepAlive() {
        return args -> {
            System.out.println("Application en attente...");
            Thread.currentThread().join(); // Empêche la fermeture
     };
}}
