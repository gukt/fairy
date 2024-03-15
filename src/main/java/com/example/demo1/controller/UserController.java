package com.example.demo1.controller;

import com.example.demo1.domain.User;
import com.example.demo1.domain.UserRepository;
import com.example.demo1.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * UserController class
 *
 * TODO APIs
 * - [x] POST /api/auth/sign-up
 * - [ ] POST /api/auth/sign-in
 * - [ ] POST /api/auth/sign-out
 * - [x] GET /api/users
 * - [x] GET /api/users/{id}
 * - [ ] PUT /api/users/{id}
 * - [ ] DELETE /api/users/{id}
 *
 * @author <a href="https://github.com/gukt">gukt</a>
 */
@RestController
@RequestMapping("api")
@Slf4j
public class UserController {

    private UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }




    /**
     * 获取用户列表。
     *
     * @return A list of {@link User}
     */
    @GetMapping("users")
    public List<User> users() {
        return userRepository.findAll();
    }

    /**
     * Get a user.
     *
     * @param id 用户 ID
     * @return An instance of {@link User}
     */
    @GetMapping("users/{id}")
    public User user(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    /**
     * Update a user.
     *
     * @param id the user id.
     * @return updated user info.
     */
    @PutMapping("users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userRepository.save(user);
    }

    /**
     * Delete a user.
     *
     * @param id the user id.
     */
    @DeleteMapping("users/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

}
