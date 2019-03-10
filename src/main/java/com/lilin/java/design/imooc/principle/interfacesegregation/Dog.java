package com.lilin.java.design.imooc.principle.interfacesegregation;

/**
 * @author lilin
 * @Title: Dog
 * @date 2019/3/9下午8:15
 */
public class Dog implements IEatAnimalAction, ISwimAninalAction {

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }
}
