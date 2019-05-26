package com.lilin.java.design.imooc.principle.pattern.behavioral.strategy;

/**
 * @author lilin
 * @Title: PromotionActivity
 * @date 2019/4/14下午11:52
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
