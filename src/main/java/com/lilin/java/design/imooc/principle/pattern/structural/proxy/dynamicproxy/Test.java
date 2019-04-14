package com.lilin.java.design.imooc.principle.pattern.structural.proxy.dynamicproxy;

import com.lilin.java.design.imooc.principle.pattern.structural.proxy.IOrderService;
import com.lilin.java.design.imooc.principle.pattern.structural.proxy.IOrderServiceImpl;
import com.lilin.java.design.imooc.principle.pattern.structural.proxy.Order;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/4/14下午7:46
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);


        IOrderService iOrderService = (IOrderService) new OrderServiceDynamicProxy(new IOrderServiceImpl()).bind();
        iOrderService.saveOrder(order);

    }
}
