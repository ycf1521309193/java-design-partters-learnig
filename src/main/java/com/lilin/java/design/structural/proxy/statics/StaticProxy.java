package com.lilin.java.design.structural.proxy.statics;

public class StaticProxy implements Subject {

	
	private Subject subject;// 真正的代理

	public StaticProxy(Subject subject) {
		this.subject = subject;
	}

	public String sell(int money) {
		if (money > 100) {
			return subject.sell(money);
		} else {
			throw new UnsupportedOperationException("the money is not enough");
		}
	}

}
