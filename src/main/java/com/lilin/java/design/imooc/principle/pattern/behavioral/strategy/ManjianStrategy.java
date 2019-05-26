package com.lilin.java.design.imooc.principle.pattern.behavioral.strategy;

/**
 * @author lilin
 * @Title: ManjianStrategy
 * @date 2019/4/14下午11:47
 */
public class ManjianStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销，满200减20");
    }
}
