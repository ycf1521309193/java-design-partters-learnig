package com.lilin.java.design.imooc.principle.pattern.behavioral.strategy;

/**
 * @author lilin
 * @Title: LijianPormotionStrategy
 * @date 2019/4/14下午11:48
 */
public class LijianPormotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程间隔直接减去配置的价格");
    }
}
