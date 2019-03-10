package com.lilin.java.design.imooc.principle.liskovsubsitution.methodinput;

import java.util.HashMap;

/**
 * @author lilin
 * @Title: Base
 * @date 2019/3/9下午9:16
 */
public class Base {

    public void method(HashMap hashMap) {
        System.out.println("父类hashMap被执行");
    }
}
