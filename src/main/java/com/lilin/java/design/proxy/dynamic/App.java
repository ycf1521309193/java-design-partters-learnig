package com.lilin.java.design.proxy.dynamic;

import java.lang.reflect.Proxy;

public class App {

	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		DynamicProxy proxy = new DynamicProxy(realSubject);
		ClassLoader loader = realSubject.getClass().getClassLoader();
		Subject subject = (Subject) Proxy.newProxyInstance(loader, realSubject.getClass().getInterfaces(), proxy);
		subject.visit();
	}
}
