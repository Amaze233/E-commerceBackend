package com.docking.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.docking.demo.POJO.Product;
import com.docking.demo.mapper.IProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ProductService
 * @Author: XIAO SIYU
 * @Date: 2022/7/20 23:02
 * @Version: 1.0
 * @Description: 商品服务
 */

@Service
public class ProductService {

    @Autowired
    IProductMapper productMapper;

    public Page<Product> getAllProducts(int pageNum, int pageSize) {
        LambdaQueryWrapper<Product> queryWrapper = Wrappers.<Product>lambdaQuery();
        return productMapper.selectPage(new Page<>(pageNum,pageSize), queryWrapper);
    }
}
