package com.lilin.java.design.imooc.principle.liskovsubsitution;

/**
 * @author lilin
 * @Title: Regtangle
 * @date 2019/3/9下午8:58
 */
public class Regtangle implements QuadRangle {

    private long length;
    private long width;

    public Regtangle setWidth(long width) {
        this.width = width;
        return this;
    }

    @Override
    public long getLength() {
        return length;
    }

    public Regtangle setLength(long length) {
        this.length = length;
        return this;
    }

    @Override
    public long getWidth() {
        return width;
    }
}
