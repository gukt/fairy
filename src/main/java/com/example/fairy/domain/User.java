package com.example.fairy.domain;

import jakarta.persistence.*;
import lombok.Data;

/**
 * User class
 *
 * @author <a href="https://github.com/gukt">gukt</a>
 */
@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
}
