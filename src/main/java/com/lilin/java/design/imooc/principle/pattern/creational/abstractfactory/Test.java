package com.lilin.java.design.imooc.principle.pattern.creational.abstractfactory;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/11下午10:58
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        article.produce();
        video.produce();

        courseFactory = new PythonFactory();
        article = courseFactory.getArticle();
        video = courseFactory.getVideo();
        article.produce();
        video.produce();
    }
}
