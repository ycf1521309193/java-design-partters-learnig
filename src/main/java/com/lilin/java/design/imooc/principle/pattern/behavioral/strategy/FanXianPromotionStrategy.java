package com.lilin.java.design.imooc.principle.pattern.behavioral.strategy;

/**
 * @author lilin
 * @Title: FanXianPromotionStrategy
 * @date 2019/4/14下午11:48
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额存放到慕课网用户的余额中");
    }
}
