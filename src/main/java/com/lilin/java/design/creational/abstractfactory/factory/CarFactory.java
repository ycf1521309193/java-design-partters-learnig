package com.lilin.java.design.creational.abstractfactory.factory;

import com.lilin.java.design.creational.abstractfactory.Sedan;
import com.lilin.java.design.creational.abstractfactory.Suv;

/**
 * //抽象汽车工厂（拥有两个产品线）
 * 
 * @author Administrator
 *
 */
public abstract class CarFactory {

	public abstract Suv getSuv();

	public abstract Sedan getSedan();

}
