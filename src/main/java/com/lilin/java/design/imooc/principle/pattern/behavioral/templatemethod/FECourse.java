package com.lilin.java.design.imooc.principle.pattern.behavioral.templatemethod;

/**
 * @author lilin
 * @Title: FECourse
 * @date 2019/4/14下午10:52
 */
public class FECourse extends ACourse {

    private boolean needWriterArticleFlag;

    public FECourse(boolean needWriterArticleFlag) {
        this.needWriterArticleFlag = needWriterArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体");
    }


    @Override
    protected boolean needWriteArticle() {
        return this.needWriterArticleFlag;
    }
}
