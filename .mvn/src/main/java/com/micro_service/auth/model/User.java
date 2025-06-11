package com.micro_service.auth.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "utilisateur")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "Email")
    private String email;

    @Size(max = 255)
    @Column(name = "Password")
    private String password;

    @Size(max = 255)
    @Column(name = "Role")
    private String role;
}