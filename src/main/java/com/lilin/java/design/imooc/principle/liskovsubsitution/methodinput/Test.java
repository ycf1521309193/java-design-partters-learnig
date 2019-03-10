package com.lilin.java.design.imooc.principle.liskovsubsitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/9下午9:20
 */
public class Test {

    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);

    }
}
