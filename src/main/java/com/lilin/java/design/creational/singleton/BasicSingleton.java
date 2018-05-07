package com.lilin.java.design.creational.singleton;

/**
 * 
 * @author Administrator
 *
 */
public class BasicSingleton {// 恶汉模式

	// 使用private将构造方法私有化，以防外界通过该构造方法创建多个实例
	private BasicSingleton() {
	}

	// 由于不能使用构造方法创建实例，所以需要在类的内部创建该类的唯一实例 1
	// 使用static修饰singleton 在外界可以通过类名调用该实例 类名.成员名
	static BasicSingleton singleton = new BasicSingleton();

	// 如果使用private封装该实例，则需要添加get方法实现对外界的开放 2
	private static BasicSingleton instance = new BasicSingleton();

	// 添加static，将该方法变成类所有 通过类名访问
	public static BasicSingleton getSingleton() {
		return singleton;
	}
	// 1和2选一种即可，推荐2
}

class Singleton {// 懒汉模式的代码如下（适合单线程）
// 每次获取instance之前先进行判断，
// 如果instance为空就new一个出来，否则就直接返回已存在的instance。
//
// 这种写法在单线程的时候是没问题的。
// 但是，当有多个线程一起工作的时候，如果有两个线程同时运行到 if (instance == null)，
// 都判断为null（第一个线程判断为空之后，并没有继续向下执行，当第二个线程判断的时候instance依然为空），
// 最终两个线程就各自会创建一个实例出来。
// 这样就破环了单例模式 实例的唯一性
	private static Singleton singleton = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

}

class Singleton2 {// 懒汉模式的代码如下（多线程要想保证实例的唯一性就需要使用synchronized，加上一个同步锁）
// 加上synchronized关键字之后，getInstance方法就会锁上了。
// 如果有两个线程（T1、T2）同时执行到这个方法时，会有其中一个线程T1获得同步锁，
// 得以继续执行，而另一个线程T2则需要等待，当第T1执行完毕getInstance之后（完成了null判断、对象创建、获得返回值之后），T2线程才会执行执行。
//
// 所以这段代码也就避免了代码一中，可能出现因为多线程导致多个实例的情况。
// 但是，这种写法也有一个问题：给getInstance方法加锁，虽然避免了可能会出现的多个实例问题，
// 但是会强制除T1之外的所有线程等待，实际上会对程序的执行效率造成负面影响。
	private static Singleton2 singleton = null;

	private Singleton2() {

	}

	public static Singleton2 getInstance() {
		synchronized (Singleton2.class) {// 加了同步锁
			if (singleton == null) {
				singleton = new Singleton2();
			}
		}
		return singleton;
	}
}

class Singleton3 {
	// 懒汉模式的代码如下（双重检查（Double-Check））
	// 加上synchronized关键字之后，getInstance方法就会锁上了。
	// 如果有两个线程（T1、T2）同时执行到这个方法时，会有其中一个线程T1获得同步锁，
	// 得以继续执行，而另一个线程T2则需要等待，当第T1执行完毕getInstance之后（完成了null判断、对象创建、获得返回值之后），T2线程才会执行执行。
	//
	// 所以这段代码也就避免了代码一中，可能出现因为多线程导致多个实例的情况。
	// 但是，这种写法也有一个问题：给getInstance方法加锁，虽然避免了可能会出现的多个实例问题，
	// 但是会强制除T1之外的所有线程等待，实际上会对程序的执行效率造成负面影响。
	private static Singleton3 singleton = null;

	private Singleton3() {

	}

	public static Singleton3 getInstance() {
		if (singleton == null) {
			synchronized (Singleton3.class) {// 加了同步锁
				if (singleton == null) {
					singleton = new Singleton3();
				}
			}
		}
		return singleton;
	}
}

class Singleton4 {
	// 懒汉模式的代码如下（原子操作检查，在声明关键字加上volatile ）
	// volatile关键字的一个作用是禁止指令重排，把instance声明为volatile之后，对它的写操作就会有一个内存屏障，
	// 这样，在它的赋值完成之前，就不用会调用读操作。
	//
	// 注意：volatile阻止的不是singleton = new Singleton()这句话内部[1-2-3]的指令重排，
	// 而是保证了在一个写操作（[1-2-3]）完成之前，不会调用读操作（if (instance == null)）。
	private static volatile Singleton4 singleton = null;

	private Singleton4() {

	}

	public static Singleton4 getInstance() {
		if (singleton == null) {
			synchronized (Singleton4.class) {// 加了同步锁
				if (singleton == null) {
					singleton = new Singleton4();
				}
			}
		}
		return singleton;
	}

}