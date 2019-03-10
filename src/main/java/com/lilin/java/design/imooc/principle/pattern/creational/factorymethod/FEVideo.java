package com.lilin.java.design.imooc.principle.pattern.creational.factorymethod;

/**
 * @author lilin
 * @Title: FEVideo
 * @date 2019/3/10下午11:21
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制FE课程视频");
    }
}
