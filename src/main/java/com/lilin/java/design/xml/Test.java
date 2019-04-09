package com.lilin.java.design.xml;

import java.util.Arrays;
import java.util.List;

/**
 * @author lilin
 * @Title: Test
 * @date 2019/3/15下午10:14
 */
public class Test {

    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                Student.builder().acctType("123").id("12No").userName("lilin").build(),
                Student.builder().acctType("1234").id("12Nox").userName("lilin2").build()
        );


        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b: " + (a == b));
        System.out.println("a.equals(b): " + (a.equals(b)));
        System.out.println("c==d: " + (c == d));
        System.out.println("c.equals(d): " + (c.equals(d)));
        System.out.println(DEFAULT_INITIAL_CAPACITY);

    }
}
