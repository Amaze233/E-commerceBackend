package com.docking.demo.controller;

import com.docking.demo.service.ProductService;
import com.docking.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: ProductController
 * @Author: XIAO SIYU
 * @Date: 2022/7/20 23:07
 * @Version: 1.0
 * @Description: 商品接口
 */
@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * @description 获取商品列表
     * @return 商品列表分页
     * @author siyu xiao
     * @date 2022/7/20 23:10
     */
    @GetMapping("/getAll")
    public Result getProductList(@RequestParam(defaultValue = "1") Integer pageNum,
                                 @RequestParam(defaultValue = "10") Integer pageSize){
        return Result.ok().data("productList",productService.getAllProducts(pageNum,pageSize));
    }
}
