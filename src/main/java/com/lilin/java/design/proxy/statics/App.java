package com.lilin.java.design.proxy.statics;

public class App {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		StaticProxy proxy = new StaticProxy(realSubject);
		System.out.println(proxy.sell(200));
		System.out.println("");
		System.out.println(proxy.sell(20));

	}

}
