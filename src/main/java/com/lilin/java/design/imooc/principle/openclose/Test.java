package com.lilin.java.design.imooc.principle.openclose;

/**
 * @author lilin
 * @Title: Tesy
 * @date 2019/3/9下午5:19
 */
public class Test {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(92, "从零到企业级Java开发", 1234d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID=" + javaDiscountCourse.getId()
                + ",课程名称=" + javaDiscountCourse.getName()
                + ",课程价格=" + javaDiscountCourse.getPrice()
                + ",课程折后价格=" + javaDiscountCourse.getDiscountPrice());

    }
}
