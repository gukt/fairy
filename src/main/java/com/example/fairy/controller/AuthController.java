package com.example.fairy.controller;

import com.example.fairy.domain.User;
import com.example.fairy.domain.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * AuthController class
 *
 * @author <a href="https://github.com/gukt">gukt</a>
 */
@RestController
@RequestMapping("api")
@Slf4j
public class AuthController {

    private final UserRepository userRepository;

    public AuthController(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    /**
     * 新用户注册。
     *
     * @param user 用户信息
     * @param request the request.
     * @return 注册成功的用户信息
     */
    @PostMapping("auth/sign-up")
    public User signUp(@RequestBody User user, HttpServletRequest request) {
        log.info("request: {}", request);
        return userRepository.save(user);
    }

    /**
     * 登陆
     *
     * @param name 用户名
     * @param password 密码
     * @return 登陆结果
     */
    @PostMapping("auth/sign-in")
    public Object signIn(String name, String password) {
        return "Not implemented yet.";
    }

    /**
     * 登出
     */
    @PostMapping("auth/sign-out")
    public Object signOut() {
        return "Not implemented yet.";
    }

    /**
     * 忘记密码，发送忘记密码邮件。
     */
    @PostMapping("auth/forgot-password")
    public Object forgotPassword() {
        return "Not implemented yet.";
    }

    /**
     * 重置密码。
     */
    @PostMapping("auth/reset-password")
    public Object resetPassword() {
        return "Not implemented yet.";
    }

    /**
     * 修改密码。
     *
     * @return
     */
    @PostMapping("auth/change-password")
    public Object changePassword() {
        return "Not implemented yet.";
    }

    /**
     * 确认用户邮件。
     *
     * @return
     */
    @GetMapping("auth/email-confirmation")
    public Object emailConfirmation() {
        return "Not implemented yet.";
    }

    /**
     * 发送邮件确认。
     *
     * @return
     */
    @PostMapping("auth/send-email-confirmation")
    public Object sendEmailConfirmation() {
        return "Not implemented yet.";
    }

}
