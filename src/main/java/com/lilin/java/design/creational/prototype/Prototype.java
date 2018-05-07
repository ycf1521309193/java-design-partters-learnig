package com.lilin.java.design.creational.prototype;

/**
 * 原型模式，即通过一个实例的原型来复制（克隆）出类似的实例，而不是去重新创建，这有
 * 点像克隆人。如果你使用过 Javascript ，你应该对 Prototype 很熟悉。
 * @author Administrator
 *
 */
public class Prototype {

	/**
	 *  简单来说就是通过实现 Cloneable 接口来进行复制，这种复制方式为浅复制。
	 *
	 */
	static class Man implements Cloneable {
		private String name = "高富帅";

		@Override
		protected Man clone() throws CloneNotSupportedException {
			return (Man) super.clone();
		}

		@Override
		public String toString() {
			return "Man [name=" + name + "]";
		}

	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Man man = new Man();
		System.out.println(man);
		System.out.println(man.clone());
		System.out.println(man.clone());
		System.out.println(man.clone());
		System.out.println(man.clone());
		System.out.println(man.clone());
	}
}
