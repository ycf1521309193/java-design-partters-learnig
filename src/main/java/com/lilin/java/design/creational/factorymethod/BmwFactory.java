package com.lilin.java.design.creational.factorymethod;

public class BmwFactory extends CarFactory {

	@Override
	Car getCar() {
		return new Bmw();
	}

}
