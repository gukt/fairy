package com.example.demo1.service;

import com.example.demo1.domain.User;
import com.example.demo1.domain.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * UserService class
 *
 * @author <a href="https://github.com/gukt">gukt</a>
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // /**
    //  * 用户注册。
    //  *
    //  * @param user 用户对象
    //  */
    // public User signUp( User user) {
    //    return userRepository.save(user);
    // }
}
