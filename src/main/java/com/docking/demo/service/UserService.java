package com.docking.demo.service;


import com.docking.demo.POJO.User;
import com.docking.demo.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: UserService
 * @Author: XIAO SIYU
 * @Date: 2022/7/19 15:47
 * @Version: 1.0
 * @Description: 用户相关服务类
 */
@Service
public class UserService {
    @Autowired
    IUserMapper userMapper;

    /**
     * @description 根据id获取用户信息
     * @param id 用户id
     * @return 对应用户信息
     * @author siyu xiao
     * @date 2022/7/19 15:49
     */
    public User getUserById(int id){
        HashMap<String, Object> user_map = new HashMap<>();
        user_map.put("user_id", id);
        User user;
        try {
            user = userMapper.selectByMap(user_map).get(0);
        }
        catch (Exception e) {
            user = null;
        }
        return user;
    }

    /**
     * @description 根据userName获取用户信息
     * @param userName 用户名
     * @return 对应用户信息
     * @author siyu xiao
     * @date 2022/7/19 15:49
     */
    public User getUserByName(String userName){
        HashMap<String, Object> user_map = new HashMap<>();
        user_map.put("user_name", userName);
        User user;
        try {
            user = userMapper.selectByMap(user_map).get(0);
        }
        catch (Exception e) {
            user = null;
        }
        return user;
    }

    /**
     * @description 登录判断
     * @param userName 用户名
     * @param userPassword 用户密码
     * @return ture -> 成功 | false -> 失败
     * @author siyu xiao
     * @date 2022/7/19 16:45
     */
    public boolean login(String userName,String userPassword){
        HashMap<String,Object> userHashMap = new HashMap<>();
        userHashMap.put("user_name",userName);
        List<User> users = userMapper.selectByMap(userHashMap);
        if (users.size()<1)
            return false;
        return users.get(0).getUserPassword().equals(userPassword);
    }

    /**
     * @description 注册判断
     * @param userName 用户名
     * @param userPassword 用户密码
     * @return ture -> 成功 | false -> 失败
     * @author siyu xiao
     * @date 2022/7/20 16:55
     */
    public boolean register(String userName, String userPassword){
        User user = new User();
        HashMap<String, Object> userHashMap = new HashMap<>();
        userHashMap.put("user_name", userName);
        if(userMapper.selectByMap(userHashMap).size() > 0)
            return false;
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        userMapper.insert(user);
        return true;
    }
}
