package com.docking.demo.POJO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: User
 * @Author: XIAO SIYU
 * @Date: 2022/7/19 15:38
 * @Version: 1.0
 * @Description: 用户实体类
 */

@Data
@TableName("user")
public class User {
    @TableId(value = "user_id", type = IdType.INPUT)
    private int userId;
    private String userName;
    private String userPassword;
}
