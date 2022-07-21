package com.docking.demo.controller;

import com.docking.demo.POJO.User;
import com.docking.demo.service.UserService;
import com.docking.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: LoginController
 * @Author: XIAO SIYU
 * @Date: 2022/6/23 17:05
 * @Version: 1.0
 * @Description: 登录控制器
 */
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * @description 登录接口
     * @param userName 用户名
     * @param userPassword 用户密码
     * @author siyu xiao
     * @date 2022/7/19 16:59
     */
    @GetMapping("/login")
    public Result login(@RequestParam("userName") String userName,
                        @RequestParam("userPassword") String userPassword) {
        if (userService.login(userName,userPassword)){
            Result result = Result.ok().message("登录成功");
            User user = userService.getUserByName(userName);
            result.data("user",user);
            return result;
        }
        return Result.error().message("登录失败，用户名和密码不匹配");
    }

    /**
     * @description 注册接口
     * @param userName 用户名
     * @param userPassword 用户密码
     * @author siyu xiao
     * @date 2022/7/20 16:58
     */
    @GetMapping("/register")
    public Result Register(@RequestParam("userName") String userName,
                            @RequestParam("userPassword") String userPassword){
        if (userService.register(userName,userPassword)){
            Result result =  Result.ok().message("注册成功");
            User user = userService.getUserByName(userName);
            result.data("user",user);
            return result;
        }
        return Result.error().message("用户已存在请重新登录");
    }
}
