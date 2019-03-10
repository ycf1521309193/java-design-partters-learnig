package com.lilin.java.design.imooc.principle.pattern.creational.factorymethod;

/**
 * 只定义规范，和契约，具体实现由子类去执行
 *
 * @author lilin
 * @Title: VideoFactory
 * @date 2019/3/9下午11:35
 */
public abstract class VideoFactory {

    /**
     * 抽象方法，具体实现由子类实现
     *
     * @return
     */
    public abstract Video getVideo();
}
