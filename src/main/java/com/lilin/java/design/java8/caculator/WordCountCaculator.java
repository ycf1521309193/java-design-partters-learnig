package com.lilin.java.design.java8.caculator;

import java.util.HashMap;
import java.util.Map;

public class WordCountCaculator {

	static String[] COUNTRY_NAMES = { "China", "Australia", "India", "USA",
			"USSR", "UK", "China", "France", "Poland", "Austria", "India",
			"USA", "Egypt", "China" };

	Map<String, Integer> counterMap = new HashMap<>();

	public Map<String, Integer> wordCounter() {

		for (String country : COUNTRY_NAMES) {
			// counterMap.
			counterMap.compute(country, (k, v) -> (v == null) ? 1 : v + 1);
		}

		return counterMap;
	}
}
