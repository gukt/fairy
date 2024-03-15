package com.example.fairy.service;

import com.example.fairy.domain.UserRepository;
import org.springframework.stereotype.Service;

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
