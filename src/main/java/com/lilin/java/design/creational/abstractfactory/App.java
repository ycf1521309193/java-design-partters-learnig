package com.lilin.java.design.creational.abstractfactory;

import com.lilin.java.design.creational.abstractfactory.factory.BenzCarFactory;
import com.lilin.java.design.creational.abstractfactory.factory.CarFactory;

public class App {

	public static void main(String[] args) {
		 CarFactory carFactory = new BenzCarFactory();
		//CarFactory carFactory = new BMWCarFactory();
		 Sedan sedan = carFactory.getSedan();
		 sedan.run();
		 Suv suv = carFactory.getSuv();
		 suv.run();
	}

}
