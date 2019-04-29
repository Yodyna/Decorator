package com.coffee;

public class Latte extends Beverage {

	@Override
	public int cost() {
		return 7;
	}

	@Override
	public String getDescription() {
		return "Latte";
	}
}
