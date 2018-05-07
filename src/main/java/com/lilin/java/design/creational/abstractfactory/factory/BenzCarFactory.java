package com.lilin.java.design.creational.abstractfactory.factory;

import com.lilin.java.design.creational.abstractfactory.BenzSedan;
import com.lilin.java.design.creational.abstractfactory.BenzSuv;
import com.lilin.java.design.creational.abstractfactory.Sedan;
import com.lilin.java.design.creational.abstractfactory.Suv;

//奔驰汽车工厂
public class BenzCarFactory extends CarFactory {

	@Override
	public Suv getSuv() {
		return new BenzSuv();
	}

	@Override
	public Sedan getSedan() {
		return new BenzSedan();
	}

}
