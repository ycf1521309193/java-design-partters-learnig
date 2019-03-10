package com.lilin.java.design.imooc.principle.liskovsubsitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilin
 * @Title: Child
 * @date 2019/3/9下午9:16
 */
public class Child extends Base {

    @Override
    public void method(HashMap hashMap) {
        System.out.println("子类 HashMap 入参被执行");
    }

    public void method(Map map) {
        System.out.println("子类 map 被执行");
    }
}
