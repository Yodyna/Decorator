package com.coffee;

public class Americano extends Beverage {

	@Override
	public int cost() {
		return 5;
	}

	@Override
	public String getDescription() {
		return "Americano";
	}

}
