package com.coffee;

public class Espresso extends Beverage {

	@Override
	public int cost() {
		return 8;
	}

	@Override
	public String getDescription() {
		return "Espresso";
	}
}
