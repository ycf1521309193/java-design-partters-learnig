package com.lilin.java.design.imooc.principle.liskovsubsitution;

/**
 * @author lilin
 * @Title: Square
 * @date 2019/3/9下午8:59
 */
public class Square implements QuadRangle {

    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public Square setSideLength(long sideLength) {
        this.sideLength = sideLength;
        return this;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }
}
