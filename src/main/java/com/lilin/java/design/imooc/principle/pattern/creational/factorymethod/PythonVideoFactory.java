package com.lilin.java.design.imooc.principle.pattern.creational.factorymethod;

/**
 * @author lilin
 * @Title: PythonVideoFactory
 * @date 2019/3/10下午11:12
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
