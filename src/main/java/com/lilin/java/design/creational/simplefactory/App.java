package com.lilin.java.design.creational.simplefactory;

import com.lilin.java.design.creational.simplefactory.SimpleFactory.Car;
import com.lilin.java.design.creational.simplefactory.SimpleFactory.CarFactory;

public class App {

	public static void main(String[] args) {
		CarFactory factory = new CarFactory();
		//Car car = factory.getCar("Benz");
		Car car = factory.getCar("BMW");
		car.run();
	}

}
