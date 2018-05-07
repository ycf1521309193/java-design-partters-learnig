/**
 * 代理模式讲解<br/>
 * 定义：<br/>
 * 为一个对象提供一个替身或者占位符以控制对这个对象的访问。被代理的对象可以是远程的对象，创建开销大的对象或者需要安全控制的对象。<br/>
 * 基本结构：<br/>
 * 基本的结构由一个公共接口Subject、一个实现类RealSubject，包含提供功能的真正的方法，一个是实现类Proxy，它是RealSubject的代理，持有RealSubject的引用，这两个类实现了相同的接口。根据不同的实现方式，还会有不同的结构。
 * @author Administrator
 *
 */
package com.lilin.java.design.proxy;