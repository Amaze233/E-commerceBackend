package com.docking.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.docking.demo.POJO.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: IUserMapper
 * @Author: XIAO SIYU
 * @Date: 2022/7/19 15:47
 * @Version: 1.0
 * @Description: 用户接口
 */
@Mapper
@Repository
public interface IUserMapper extends BaseMapper<User> {
}
