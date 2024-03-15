package com.example.demo1.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository class
 *
 * @author <a href="https://github.com/gukt">gukt</a>
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
