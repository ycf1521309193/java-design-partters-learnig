package com.lilin.java.design.imooc.principle.dependencyinversion;

/**
 * @author lilin
 * @Title: PythonCourse
 * @date 2019/3/9下午5:29
 */
public class PythonCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("我在学习Python程");
    }
}
