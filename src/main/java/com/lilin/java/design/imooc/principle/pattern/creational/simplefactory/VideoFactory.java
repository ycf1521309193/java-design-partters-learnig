package com.lilin.java.design.imooc.principle.pattern.creational.simplefactory;

/**
 * @author lilin
 * @Title: VideoFactory
 * @date 2019/3/9下午11:35
 */
public class VideoFactory {

    /**
     * 利用反射工具
     *
     * @param c
     * @return
     */
    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

//    public Video getVideo(String type) {
//        if ("java".equals(type)) {
//            return new JavaVideo();
//        } else if ("python".equals(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }
}
