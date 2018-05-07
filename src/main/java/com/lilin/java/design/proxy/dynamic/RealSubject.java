package com.lilin.java.design.proxy.dynamic;

public class RealSubject implements Subject {
	 private String name = "this is real message";
	 
	public void visit() {
		 System.out.println(name);
	}

}
