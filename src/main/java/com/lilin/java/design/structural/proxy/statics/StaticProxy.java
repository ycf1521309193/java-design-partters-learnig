package com.lilin.java.design.structural.proxy.statics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaticProxy implements Subject {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());  
	
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
