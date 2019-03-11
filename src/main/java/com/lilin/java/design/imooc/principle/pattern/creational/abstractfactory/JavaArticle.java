package com.lilin.java.design.imooc.principle.pattern.creational.abstractfactory;

/**
 * @author lilin
 * @Title: JavaArticle
 * @date 2019/3/11下午10:56
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java手记");
    }
}
