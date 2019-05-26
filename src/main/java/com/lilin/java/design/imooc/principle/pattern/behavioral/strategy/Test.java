package com.lilin.java.design.imooc.principle.pattern.behavioral.strategy;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/4/14下午11:55
 */
public class Test {
    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LijianPormotionStrategy());
//        PromotionActivity promotionActivity11 = new PromotionActivity(new FanXianPromotionStrategy());
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity11.executePromotionStrategy();

        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
