package com.docking.demo.POJO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: Product
 * @Author: XIAO SIYU
 * @Date: 2022/7/20 22:56
 * @Version: 1.0
 * @Description: 商品实体类
 */

@Data
@TableName("product")
public class Product {
    @TableId(value = "product_id", type = IdType.INPUT)
    private int productId;
    private String productName;
    private float productPrice;
    private String productDescription;
    private String productUrl;
}
