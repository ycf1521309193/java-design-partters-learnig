package com.lilin.java.design.structural.delegator;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Map;


public class Delegator4Map extends Delegator {
	private Map orginClass = null; // 原始对象
	private Map proxyClass = null; // 代理对象

	public Map getOrgin() {
		return orginClass;
	}

	public Map getProxy() {
		return proxyClass;
	}

	public Delegator4Map(Map orgin) {
		super(orgin);
		orginClass = orgin;
		proxyClass = (Map) super.obj_proxy;
	}

	public Object invoke(Object obj, Method method, Object[] args)
			throws Throwable {
		if (method.getName().equals("size")) { // 修改size处理逻辑
			Object res2 = new Integer(-1);
			System.out.println("调用委托的方法");
			return res2;
		} else {
			System.out.println("调用原始的方法");
			return super.invoke(obj, method, args);
		}
	}

	public static void main(String[] args) {
		Delegator4Map rtm = new Delegator4Map(new Hashtable());
		Map map = rtm.getProxy();
		map.size();
	}
}
