package com.lilin.java.design.structural.delegator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 委托模式
 * 
 * @author Administrator
 *
 */
public class Delegator implements InvocationHandler {

	/**
	 * 原始对象
	 */
	protected Object obj_orgin = null;
	/**
	 * 代理对象
	 */
	protected Object obj_proxy = null;

	public Delegator() {
	}

	public Delegator(Object orgin) {
		this.createProxy(orgin);
	}

	protected Object createProxy(Object orgin) {
		obj_orgin = orgin;
		// 委托
		obj_proxy = Proxy.newProxyInstance(orgin.getClass().getClassLoader(),
				orgin.getClass().getInterfaces(), this);
		return obj_proxy;
	}

	protected Object invokeSuper(Method method, Object[] args) throws Throwable {
		return method.invoke(obj_orgin, args);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if (method.getName().equals("toString")) {// 对其做额外处理
			return this.invokeSuper(method, args) + "$Proxy";
		} else {
			return this.invokeSuper(method, args);
		}

	}

}
