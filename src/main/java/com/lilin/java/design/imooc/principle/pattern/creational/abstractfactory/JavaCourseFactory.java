package com.lilin.java.design.imooc.principle.pattern.creational.abstractfactory;

/**
 * @author lilin
 * @Title: JavaCourseFactory
 * @date 2019/3/11下午10:54
 */
public class JavaCourseFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
