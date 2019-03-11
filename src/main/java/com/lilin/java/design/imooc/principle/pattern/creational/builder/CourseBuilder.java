package com.lilin.java.design.imooc.principle.pattern.creational.builder;

/**
 * @author lilin
 * @Title: CourseBuilder
 * @date 2019/3/11下午11:20
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
