package com.lilin.java.design.creational.builder;

public class Builder {

	static class Phone {
		private String displayScreen;// 显示器
		private String battery;// 电池
		private String camera;// 摄像头
		private String operatingSystem;// 操作系统

		public String getDisplayScreen() {
			return displayScreen;
		}

		public void setDisplayScreen(String displayScreen) {
			this.displayScreen = displayScreen;
		}

		public String getBattery() {
			return battery;
		}

		public void setBattery(String battery) {
			this.battery = battery;
		}

		public String getCamera() {
			return camera;
		}

		public void setCamera(String camera) {
			this.camera = camera;
		}

		public String getOperatingSystem() {
			return operatingSystem;
		}

		public void setOperatingSystem(String operatingSystem) {
			this.operatingSystem = operatingSystem;
		}

	}
	
	static class PhoneBuilder{
		public Phone build() {
			Phone phone = new Phone();
			phone.setBattery("三星电池");
			phone.setCamera("索尼摄像头");
			phone.setDisplayScreen("京东方柔屏显示");
			phone.setOperatingSystem("安卓系统");
			System.out.println(String.format("手机创建完成，使用%s、%s、%s、%s。",
					phone.getBattery(), phone.getCamera(),
					phone.getDisplayScreen(), phone.getOperatingSystem()));
			return phone;
		}
	}

}
