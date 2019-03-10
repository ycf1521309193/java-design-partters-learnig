package com.lilin.java.design.imooc.principle.pattern.creational.factorymethod;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/9下午11:31
 */
public class Test {


    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

//        videoFactory = new PythonVideoFactory();
//        video = videoFactory.getVideo();
//        video.produce();
    }
}
