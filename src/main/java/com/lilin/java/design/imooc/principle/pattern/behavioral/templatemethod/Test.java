package com.lilin.java.design.imooc.principle.pattern.behavioral.templatemethod;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/4/14下午10:53
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println("后端设计模式课程---start");
//        ACourse designPatternCourse = new DesignPatternCourse();
//        designPatternCourse.makeCourse();
//        System.out.println("后端设计模式课程---end");

        System.out.println("前端设计模式课程---start");
        ACourse feCourse = new FECourse(false);
        feCourse.makeCourse();
        System.out.println("前端设计模式课程---end");

    }
}
