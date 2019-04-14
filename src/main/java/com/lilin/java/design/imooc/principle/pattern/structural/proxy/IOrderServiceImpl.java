package com.lilin.java.design.imooc.principle.pattern.structural.proxy;

/**
 * @author lilin
 * @Title: IOrderServiceImpl
 * @date 2019/4/14下午6:14
 */
public class IOrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        //spring 自己会注入，这里就用new
        iOrderDao = new IOrderDaoImpl();
        System.out.println("Service成调用Dao成添加order");
        return iOrderDao.insert(order);
    }
}
