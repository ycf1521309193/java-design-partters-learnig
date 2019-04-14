package com.lilin.java.design.imooc.principle.pattern.structural.proxy.dynamicproxy;

import com.lilin.java.design.imooc.principle.pattern.structural.proxy.Order;
import com.lilin.java.design.imooc.principle.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lilin
 * @Title: OrderServiceDynamicProxy
 * @date 2019/4/14下午7:32
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    /**
     * 目标代理对象
     */
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }


    /**
     * 绑定代理对象方法
     *
     * @return
     */
    public Object bind() {
        Class aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }


    private void beforeMethod(Object object) {
        int userId = 0;
        System.out.println("动态代理 before code");
        if (object instanceof Object) {
            Order order = (Order) object;
            userId = order.getUserId();

        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");
        //设置datasource
        DataSourceContextHolder.setDBType("db" + dbRouter);
    }


    private void afterMethod() {
        System.out.println("动态代理 after code");
    }
}
