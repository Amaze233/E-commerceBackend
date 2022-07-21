package com.docking.demo.controller;

import com.docking.demo.service.UserService;
import com.docking.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: UserController
 * @Author: XIAO SIYU
 * @Date: 2022/7/19 15:51
 * @Version: 1.0
 * @Description: 用户控制层
 */

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/getById")
    public Result getUserById(@RequestParam("userId") Integer id){
        return Result.ok().data("user",userService.getUserById(id));
    }
}
