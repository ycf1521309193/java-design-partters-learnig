package com.lilin.java.design.structural.decorator;

/**
 * @see java.io.InputStream InputStream 抽象构件
 * @see java.io.FilterInputStream FilterInputStream 抽象装饰类
 * @see java.io.BufferedInputStream BufferedInputStream 具体的装饰类
 * @see java.io.DataInputStream DataInputStream 具体的装饰类
 *
 */
public class Decorator {

	// 抽象构建（Component）
	static abstract class Man {
		abstract void aboutMe();
	}

	// 具体的构件(ConcreteComponent)
	static class Potato extends Man {

		@Override
		void aboutMe() {
			System.out.println("大家好，我是土豆");
		}

	}

	// 抽象装饰类(Decorator)
	static abstract class Decorators extends Man {

		private Man man;

		public Decorators(Man man) {
			this.man = man;
		}

		@Override
		void aboutMe() {
			man.aboutMe();
		}
	}

	// 具体装饰类（ConcreteDecorator）
	static class ProgramerDecorator extends Decorators {

		public ProgramerDecorator(Man man) {
			super(man);
		}

		@Override
		void aboutMe() {
			super.aboutMe();
			System.out.println(",我的职业是程序猿");
		}
	}

	// 具体装饰类（ConcreteDecorator）
	static class ReadeDecorator extends Decorators {

		public ReadeDecorator(Man man) {
			super(man);
		}

		@Override
		void aboutMe() {
			super.aboutMe();
			System.out.println(",我喜欢读书");
		}
	}

	// 具体装饰类（ConcreteDecorator）
	static class GitHubDecorator extends Decorators {

		public GitHubDecorator(Man man) {
			super(man);
		}

		@Override
		void aboutMe() {
			super.aboutMe();
			System.out.println(",我有事没事就爱去Github溜达溜达");
		}
	}

	// 具体装饰类（ConcreteDecorator）
	static class WriterDecorator extends Decorators {

		public WriterDecorator(Man man) {
			super(man);
		}

		@Override
		void aboutMe() {
			super.aboutMe();
			System.out.println(",也会去写一些技术文章");
		}
	}

	public static void main(String[] args) {
		Man man  = new Potato();
		man.aboutMe();//大家好，我是土豆
		System.out.println();
		man = new WriterDecorator(new GitHubDecorator(new ReadeDecorator(new ProgramerDecorator(man))));
		man.aboutMe();
		
	}
}
