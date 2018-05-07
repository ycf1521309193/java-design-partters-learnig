package com.lilin.java.design.creational.factorymethod;

public class App {

	public static void main(String[] args) {
//		CarFactory carFactory = new BenzFactory();
		CarFactory carFactory = new BmwFactory();
		Car car =carFactory.getCar();
		car.run();

	}

}
