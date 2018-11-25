package com.lilin.java.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TechnicalStatistics implements Statistics {

	private List<Statistics> statistics = new ArrayList<Statistics>(); 
	
	
	protected TechnicalStatistics() {
	}

	@Override
	public int getBrowseCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSalesCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
