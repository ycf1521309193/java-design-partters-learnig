package com.lilin.java.design.creational.abstractfactory.factory;

import com.lilin.java.design.creational.abstractfactory.BMWSedan;
import com.lilin.java.design.creational.abstractfactory.BMWSuv;
import com.lilin.java.design.creational.abstractfactory.Sedan;
import com.lilin.java.design.creational.abstractfactory.Suv;

//宝马汽车工厂
public class BMWCarFactory extends CarFactory {

	@Override
	public Suv getSuv() {
		return new BMWSuv();
	}

	@Override
	public Sedan getSedan() {
		return new BMWSedan();
	}

}
