package com.docking.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.docking.demo.POJO.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: IProductMapper
 * @Author: XIAO SIYU
 * @Date: 2022/7/20 23:02
 * @Version: 1.0
 * @Description: 商品接口
 */

@Mapper
@Repository
public interface IProductMapper extends BaseMapper<Product> {
}
