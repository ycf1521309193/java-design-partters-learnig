package com.lilin.java.design.imooc.principle.pattern.creational.factorymethod;

/**
 * @author lilin
 * @Title: FEVedioFactory
 * @date 2019/3/10下午11:21
 */
public class FEVedioFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVedio();
    }
}
