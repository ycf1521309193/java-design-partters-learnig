package com.lilin.java.design.imooc.principle.pattern.structural.proxy.staticproxy;

import com.lilin.java.design.imooc.principle.pattern.structural.proxy.Order;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/4/14下午6:33
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(3);
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
