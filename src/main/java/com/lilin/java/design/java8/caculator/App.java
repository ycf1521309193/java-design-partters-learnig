package com.lilin.java.design.java8.caculator;

import java.util.Map;


public class App {
	
	public static void main(String[] args) {
		WordCountCaculator caculator = new WordCountCaculator();
		Map<String, Integer> map = caculator.wordCounter();
		for (String country : map.keySet()) {
			System.out.println(String.format("%s-(%s)times", country,map.get(country)));
			
		}
		//caculator.wordCounter();
	}

}
