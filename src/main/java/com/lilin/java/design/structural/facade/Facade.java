package com.lilin.java.design.structural.facade;

/**
 * 外观模式，也称门面模式，用于为一个复杂的系统提供一个统一、简单的访问入口
 *
 */
public class Facade {

	//系统门面
	static class SystemFacade{
		void start(){
			new SubSystmeA().start();
			new SubSystmeB().start();
			new SubSystmeC().start();
			new SubSystmeD().start();
		}
	}
	
	static class SubSystmeA{
		void start(){
			System.out.println("子系统A启动。。。");
		}
	}
	static class SubSystmeB{
		void start(){
			System.out.println("子系统B启动。。。");
		}
	}
	static class SubSystmeC{
		void start(){
			System.out.println("子系统C启动。。。");
		}
	}
	static class SubSystmeD{
		void start(){
			System.out.println("子系统D启动。。。");
		}
	}
	
	public static void main(String[] args) {
		SystemFacade facade = new SystemFacade();
		facade.start();
	}
}
