package com.pcforge.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Getter
@Setter
@Entity
@Table(name = "\"User\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_ID", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long userID;

    @Column(name = "username", nullable = false, length = 100, unique = true)
    private String username;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Column(name = "phone_number", length = 9)
    private String phoneNumber;

    @Column(name = "password", nullable = false)
    private String password;

    @ColumnDefault("0")
    @Column(name = "newsletter", nullable = false)
    private Boolean newsletter = false;

    @ColumnDefault("customer")
    @Column(name = "role", nullable = false, length = 10)
    private String role;

}