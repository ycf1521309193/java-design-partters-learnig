package com.lilin.java.design.imooc.principle.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 促销策略工厂类
 *
 * @author lilin
 * @Title: PromotionStrategyFactory
 * @date 2019/4/15上午12:02
 */
public class PromotionStrategyFactory {
    private static final PromotionStrategy NONE_PROMOTION = new EmptyPromotionStrategy();
    public static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LijianPormotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManjianStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
    }


    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        return PROMOTION_STRATEGY_MAP.getOrDefault(promotionKey, NONE_PROMOTION);
    }

    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
