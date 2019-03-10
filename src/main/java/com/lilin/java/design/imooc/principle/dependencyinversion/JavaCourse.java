package com.lilin.java.design.imooc.principle.dependencyinversion;

/**
 * @author lilin
 * @Title: JavaCourse
 * @date 2019/3/9下午5:29
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("我在学习Java课程");
    }
}
