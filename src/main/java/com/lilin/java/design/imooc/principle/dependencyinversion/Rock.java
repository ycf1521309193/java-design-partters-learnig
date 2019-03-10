package com.lilin.java.design.imooc.principle.dependencyinversion;

/**
 * @author lilin
 * @Title: Rock
 * @date 2019/3/9下午5:31
 */
public class Rock {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImmocCourse() {
        iCourse.studyCourse();
    }
}
