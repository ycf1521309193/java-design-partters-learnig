package com.lilin.java.design.imooc.principle.pattern.creational.abstractfactory;

/**
 * @author lilin
 * @Title: PythonFactory
 * @date 2019/3/11下午10:58
 */
public class PythonFactory implements CourseFactory {

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
