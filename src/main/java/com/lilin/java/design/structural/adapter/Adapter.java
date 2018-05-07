package com.lilin.java.design.structural.adapter;

import org.junit.Test;

/**
 * 适配器模式，用于将一个类的接口转换成客户端所期待的另一种接口。
 *
 */
public class Adapter {

	// ////////////////////////////////////////////////////////////////////
	// 								类适配器 								 //
	// ////////////////////////////////////////////////////////////////////
	// 被适配的源对象(Adaptee)
	static class Power220V {
		public void in() {
			System.out.print("220V电流输入 ");
		}
	}

	// 目标接口（target）
	interface Power5V {
		void in();
	}

	// 适配器(Adapter)，电源适配器为例
	static class PowerAdapter extends Power220V implements Power5V {
		@Override
		public void in() {
			System.out.print("5V电流输入");
			System.out.print("(");
			super.in();
			System.out.print(")");
			System.out.println();
		}
	}

	static class Iphone {
		public void charge(Power5V power5v) {
			System.out.print("充电中。。。。。");
			power5v.in();
		}
	}
	
	@Test
	public void testClassAdapter(){
		Iphone iphone = new Iphone();
		PowerAdapter adapter = new PowerAdapter();
		iphone.charge(adapter);
	}
	
	
    //////////////////////////////////////////////////////////////////////
    //                           对象适配器                              				        //
    //////////////////////////////////////////////////////////////////////

	
	static class PowerAdapter2 implements Power5V {

		private Power220V power220v;

		public PowerAdapter2(Power220V power220v) {
			this.power220v = power220v;
		}

		public void in() {
			System.out.print("5V电流输入");
			System.out.print("(");
			power220v.in();
			System.out.print(")");
			System.out.println();
		}
	}
	 
	@Test
	public void testObjectAdapter() {
		Iphone iphone = new Iphone();
		PowerAdapter2 adapter2 = new PowerAdapter2(new Power220V());
		iphone.charge(adapter2);
		// 充电中。。。。。5V电流输入 (220V电流输入 )
	}
}
