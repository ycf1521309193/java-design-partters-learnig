package com.lilin.java.design.structural.bridge;

public class Bridge {
	// 太阳镜的抽象类
	static abstract class SunGlasses {

		protected Style style;

		// 获取品牌名称
		abstract String getBrandName();

		public SunGlasses(Style style) {
			this.style = style;
		}

		public void putOn() {
			System.out.println(String.format("带上%s-%s风格的太阳镜。", getBrandName(),
					style.getStyle()));
		};

	}

	static class BolonSunGlasses extends SunGlasses {

		public BolonSunGlasses(Style style) {
			super(style);
		}

		@Override
		String getBrandName() {
			return "暴龙";
		}
	}

	static class DiorSunGlasses extends SunGlasses {

		public DiorSunGlasses(Style style) {
			super(style);
		}

		@Override
		String getBrandName() {
			return "迪奥";
		}

	}

	// 太阳镜风格
	interface Style {
		String getStyle();
	}

	// 复古风格
	static class RetroStyle implements Style {

		public String getStyle() {
			return "复古";
		}

	}

	// 飞行员风格
	static class PilotStyle implements Style {

		public String getStyle() {
			return "飞行员";
		}
	}

	public static void main(String[] args) {
		RetroStyle retroStyle = new RetroStyle();
		PilotStyle pilotStyle = new PilotStyle();
		SunGlasses glasses = new DiorSunGlasses(pilotStyle);
		glasses.putOn();// 带上迪奥-飞行员风格的太阳镜。
		glasses = new DiorSunGlasses(retroStyle);
		glasses.putOn();// 带上迪奥-复古风格的太阳镜。

		glasses = new BolonSunGlasses(retroStyle);
		glasses.putOn();// 带上暴龙-复古风格的太阳镜。
		glasses = new BolonSunGlasses(pilotStyle);
		glasses.putOn();// 带上暴龙-飞行员风格的太阳镜。
	}
}
