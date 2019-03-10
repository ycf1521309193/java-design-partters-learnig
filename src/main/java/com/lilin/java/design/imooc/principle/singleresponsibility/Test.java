package com.lilin.java.design.imooc.principle.singleresponsibility;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/9下午5:52
 */
public class Test {
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
