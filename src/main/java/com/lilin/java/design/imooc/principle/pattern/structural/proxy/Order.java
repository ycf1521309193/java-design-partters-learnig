package com.lilin.java.design.imooc.principle.pattern.structural.proxy;

import lombok.Data;

/**
 * 订单对象
 *
 * @author lilin
 * @Title: Order
 * @date 2019/4/14下午6:11
 */
@Data
public class Order {

    private Object orderInfo;
    private Integer userId;
}
