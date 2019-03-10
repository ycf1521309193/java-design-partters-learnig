package com.lilin.java.design.imooc.principle.interfacesegregation;

/**
 * @author lilin
 * @Title: BIrd
 * @date 2019/3/9下午8:16
 */
public class BIrd implements IEatAnimalAction, IFlyAnimalAction {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
