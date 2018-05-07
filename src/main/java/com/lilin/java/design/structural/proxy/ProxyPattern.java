package com.lilin.java.design.structural.proxy;

import java.util.ArrayList;
import java.util.List;

import net.sf.cglib.proxy.Proxy;

public class ProxyPattern {

	// 唱歌的能力
	interface Singable {
		void sing();
	}

	 //歌手
	static class Singer implements Singable {

		public void sing() {
			System.out.println("歌手唱歌");
		}
	}
	
	//歌手代理人
	static class SingerProxy implements Singable{
		
		//歌手
		private Singer singer;
		
		protected SingerProxy(Singer singer) {
			this.singer = singer;
		}


		public void sing() {
			 System.out.println("代理人承接演出");
			 System.out.println("代理人布置演出场地");
			 singer.sing();
			 System.out.println("代理人结算演出费用");
		}
		
	}
	
	private static class DynamicProxy{
		@SuppressWarnings("unchecked")
		public static <T> T proxy(T target){
			return (T)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), 
					target.getClass().getInterfaces(), (proxy, method, args) ->{
						 System.out.println("前置代理，调用方法：" + method.getName()+"()");
						 Object result = method.invoke(target, args);
						 System.out.println("后置代理，方法返回：" + result);
						 return result;
					});
		}
	}
	
	public static void main(String[] args) {
		 Singer singer = new Singer();
		 SingerProxy singerProxy = new SingerProxy(singer);
		 singerProxy.sing();
		// 代理人承接演出
		// 代理人布置演出场地
		// 歌手唱歌
		// 代理人结算演出费用
		 
		 
		  // 如果，代理目标方法较多使用静态代理较为麻烦，可以使用动态代理，下面是使用JDK实
	      // 现动态代理的方式，这种方式有一个要求，被代理的对象必须实现接口。
		 List list = DynamicProxy.proxy(new ArrayList());
		 list.add("data");
	     list.size();
	     list.remove("data");
	}
	
	
}
