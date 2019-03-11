package com.lilin.java.design.imooc.principle.pattern.creational.abstractfactory;

/**
 * @author lilin
 * @Title: JavaVideo
 * @date 2019/3/11下午10:55
 */
public class JavaVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
