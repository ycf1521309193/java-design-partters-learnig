package com.lilin.java.design.imooc.principle.pattern.behavioral.templatemethod;

/**
 * @author lilin
 * @Title: DesignPatternCourse
 * @date 2019/4/14下午10:52
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
