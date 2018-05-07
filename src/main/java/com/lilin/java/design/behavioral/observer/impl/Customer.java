package com.lilin.java.design.behavioral.observer.impl;

import com.lilin.java.design.behavioral.observer.Observer;


public class Customer implements Observer {

	private String name;
	private int edition;
	private float cost;

	public Customer(String name) {
		this.name = name;
	}

	public void update(int edition, float cost) {
		this.edition = edition;
		this.cost = cost;
		buy();
	}

	public void buy() {
		System.out.println(name + "购买了第" + edition + "版本的杂志，花了" + cost + "元");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
}
