# singleton
# 单例模式
	单例，顾名思义就是只能有一个、不能再出现第二个。就如同地球上没有两片一模一样的树叶一样。
	在这里就是说：一个类只能有一个实例，并且整个项目系统都能访问该实例。
	单例模式共分为两大类：
## 饿汉模式：
	实例在第一次使用时创建
	public class BasicSingleton {

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
	//1和2选一种即可，推荐2
	
	对于饿汉模式来说，这种写法已经很‘perfect’了，唯一的缺点就是，由于instance的初始化是在类加载时进行的，类加载是由ClassLoader来实现的，如果初始化太早，就会造成资源浪费。
	当然，如果所需的单例占用的资源很少，并且也不依赖于其他数据，那么这种实现方式也是很好的。
	类装载的时机：
	#item new一个对象时
	#item 使用反射创建它的实例时
	#item 子类被加载时，如果父类还没有加载，就先加载父类
	#item JVM启动时执行主类 会先被加载

}

## 懒汉模式
	实例在类装载时创建
	懒汉模式的代码如下
	 // 代码一
	public class Singleton {
	   private static Singleton instance = null;
	   private Singleton(){
	   }
	   public static Singleton getInstance() {
	       if (instance == null) {
	           instance = new Singleton(); 
	       }        
	       return instance; 
	  }
	}
	

