package com.lilin.java.design.imooc.principle.pattern.structural.proxy;

/**
 * @author lilin
 * @Title: IOrderDaoImpl
 * @date 2019/4/14下午6:15
 */
public class IOrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao成添加order成功");
        return 1;
    }
}
