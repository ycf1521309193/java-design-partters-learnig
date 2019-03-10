package com.lilin.java.design.imooc.principle.pattern.creational.factorymethod;

/**
 * @author lilin
 * @Title: JavaVideoFactory
 * @date 2019/3/10下午11:12
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
