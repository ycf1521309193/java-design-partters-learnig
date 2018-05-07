package com.lilin.java.design.behavioral.observer;

import com.lilin.java.design.behavioral.observer.impl.Customer;
import com.lilin.java.design.behavioral.observer.impl.MagazineData;

public class App {

	public static void main(String[] args) {
		// 创建被观察者
		MagazineData magazine = new MagazineData();

		// 创建三个不同的观察者
		Observer customerA = new Customer("A");
		Observer customerB = new Customer("B");
		Observer customerC = new Customer("C");

		magazine.registerObserver(customerA);
		magazine.registerObserver(customerB);
		magazine.registerObserver(customerC);

		// 更新被观察者中的数据，当数据更新后，会自动通知所有已注册的观察者
		magazine.setInfomation(5, 12);
		magazine.removeObserver(customerC);
		magazine.setInfomation(5, 222);

	}

}
