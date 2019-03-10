package com.lilin.java.design.imooc.principle.pattern.creational.simplefactory;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/9下午11:31
 */
public class Test {

//    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();
//    }

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
