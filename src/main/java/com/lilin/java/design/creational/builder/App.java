package com.lilin.java.design.creational.builder;

import com.lilin.java.design.creational.builder.Builder.PhoneBuilder;

public class App {

	public static void main(String[] args) {
		PhoneBuilder builder = new PhoneBuilder();
		builder.build();
		//手机创建完成，使用三星电池、索尼摄像头、京东方柔屏显示、安卓系统。
	}

}
