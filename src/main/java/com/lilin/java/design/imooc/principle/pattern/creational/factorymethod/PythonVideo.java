package com.lilin.java.design.imooc.principle.pattern.creational.factorymethod;

/**
 * @author lilin
 * @Title: PythonVideo
 * @date 2019/3/9下午11:25
 */
public class PythonVideo extends Video {

    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
