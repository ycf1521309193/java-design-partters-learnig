package com.lilin.java.design.creational.factorymethod;

public class BenzFactory extends CarFactory {

	@Override
	Car getCar() {
		return new Benz();
	}

}
