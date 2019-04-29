package com.coffee;

public class Cappuccino extends Beverage {

	@Override
	public int cost() {
		return 5;
	}

	@Override
	public String getDescription() {
		return "Cappuccino";
	}

}
