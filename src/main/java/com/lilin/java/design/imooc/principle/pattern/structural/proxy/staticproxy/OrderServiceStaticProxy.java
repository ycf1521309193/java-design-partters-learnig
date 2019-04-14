package com.lilin.java.design.imooc.principle.pattern.structural.proxy.staticproxy;

import com.lilin.java.design.imooc.principle.pattern.structural.proxy.IOrderService;
import com.lilin.java.design.imooc.principle.pattern.structural.proxy.IOrderServiceImpl;
import com.lilin.java.design.imooc.principle.pattern.structural.proxy.Order;
import com.lilin.java.design.imooc.principle.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @author lilin
 * @Title: OrderServiceStaticProxy
 * @date 2019/4/14下午6:29
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new IOrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }


    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");
        //TODO 设置datasource
        DataSourceContextHolder.setDBType("db" + dbRouter);
        System.out.println("静态代理 before code");
    }


    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
