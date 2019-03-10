package com.lilin.java.design.imooc.principle.singleresponsibility;

/**
 * @author lilin
 * @Title: ICourse
 * @date 2019/3/9下午5:42
 */
public interface ICourse {

    String getCourseName();

    byte[] getCourseVideo();

    void studyCourse();

    void refundCourse();
}
