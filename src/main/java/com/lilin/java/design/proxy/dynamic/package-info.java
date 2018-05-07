/**
 * 动态代理分一下两种：
 * 1、jdk默认动态代理
 * 	JDK实现方式：这种方式仅仅支持接口代理，如果涉及到有些类并没有实现接口，则不能用这种方式来实现动态代理，而是用cglib；
 * 		关键的类和接口：
 * 			java.lang.reflect.InvocationHandler
 * 			java.lang.reflect.Proxy
 * 2、cglib
 *	可以支持接口代理，也可以对没有实现接口的类提供动态代理
 */
package com.lilin.java.design.proxy.dynamic;