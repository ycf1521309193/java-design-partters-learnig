package com.lilin.java.design.imooc.principle.openclose;

/**
 * @author lilin
 * @Title: JavaDiscountCourse
 * @date 2019/3/9下午5:15
 */
public class JavaDiscountCourse extends JavaCourse {


    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
