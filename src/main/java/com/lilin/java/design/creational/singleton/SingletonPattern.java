package com.lilin.java.design.creational.singleton;

import java.util.Objects;

import org.junit.Assert;

public class SingletonPattern {

	/**
	 * 懒汉式，线程不安全，在使用时初始化示例（懒加载）
	 */
	static class Singleton1 {
		private static Singleton1 singleton;

		private Singleton1() {
			new AssertionError("don't support reflect.");
		}

		public static Singleton1 getInstance() {
			if (singleton == null) {
				singleton = new Singleton1();
			}
			return singleton;
		}
	}

	/**
	 * 懒汉式，线程安全，在使用时初始化示例（懒加载）
	 */
	static class Singleton2 {
		private static Singleton2 singleton;

		private Singleton2() {
			new AssertionError("don't support reflect.");
		}

		public static synchronized Singleton2 getInstance() {
			if (singleton == null) {
				singleton = new Singleton2();
			}
			return singleton;
		}
	}

	/**
	 * 懒汉式线程安全的优化写法，双重检验锁模式（double checked locking pattern）
	 */
	static class Singleton3 {
		private static Singleton3 singleton;

		private Singleton3() {
			new AssertionError("don't support reflect.");
		}

		public static Singleton3 getInstance() {
			if (singleton == null) {// Single Checked
				synchronized (Singleton3.class) {
					if (singleton == null) {// Double checked
						singleton = new Singleton3();
					}

				}
			}
			return singleton;
		}
	}

	/**
	 * 饿汉式 static final field，在类被被类加载器加载时便创建实例
	 */
	static class Singleton4 {
		private static final Singleton4 instace = new Singleton4();

		private Singleton4() {
			new AssertionError("don't support reflect.");
		}

		public static Singleton4 getInstance() {
			return instace;
		}
	}

	
	/**
	 * 使用静态内部类 static nested class ,这种方法是《Effective Java》上所推荐的
	 */
	static class Singleton5 {
		private static class SingletonHolder {
            private static final Singleton5 INSTANCE = new Singleton5();
        }
		
		private Singleton5() {
			new AssertionError("don't support reflect.");
		}
		
		public static Singleton5 getInstance() {
			return SingletonHolder.INSTANCE;
		}
	}
	
	/**
	 * 使用枚举，这也是单例模式最简单的实现 ,这种方法也是《Effective Java》上所推荐的
	 */
	static enum Singleton6 {
		INSTANCE;
	}
	
	public static void main(String[] args) {
//        Assert.assertTrue(Objects.equals(Singleton1.getInstance(), Singleton1.getInstance()));
//        Assert.assertTrue(Objects.equals(Singleton1.getInstance(), Singleton1.getInstance()));
//        Assert.assertTrue(Objects.equals(Singleton2.getInstance(), Singleton2.getInstance()));
//        Assert.assertTrue(Objects.equals(Singleton3.getInstance(), Singleton3.getInstance()));
//        Assert.assertTrue(Objects.equals(Singleton4.getInstance(), Singleton4.getInstance()));
//        Assert.assertTrue(Objects.equals(Singleton5.getInstance(), Singleton5.getInstance()));
       System.out.println(Objects.equals(Singleton6.INSTANCE, Singleton6.INSTANCE));
    }
}
