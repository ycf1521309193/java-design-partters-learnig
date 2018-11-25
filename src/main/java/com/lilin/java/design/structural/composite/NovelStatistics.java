package com.lilin.java.design.structural.composite;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class NovelStatistics implements Statistics {
	static List<String> allMedicalBooks;
	static Map<String, Integer> allBrowserCount = new HashMap<String, Integer>();
	static Map<String, Integer> allSalesCount = new HashMap<String, Integer>();
	static {
		allMedicalBooks = Arrays.asList(new String[] { "小说", "科技", "计算机", "医学" });
		for (int i = 0; i < allMedicalBooks.size(); i++) {
			Random radRandom = new Random();
			allBrowserCount.put(allMedicalBooks.get(i), radRandom.nextInt(100));
			allSalesCount.put(allMedicalBooks.get(i), radRandom.nextInt(1000));
		}
	}

	@Override
	public int getBrowseCount() {
		int browseCount = 0;
		for (String string : allMedicalBooks) {
			browseCount += allBrowserCount.get(string).intValue();
		}
		return browseCount;
	}

	@Override
	public int getSalesCount() {
		int saleCount = 0;
		for (String string : allMedicalBooks) {
			saleCount += allSalesCount.get(string).intValue();

		}
		return saleCount;
	}
	


}
