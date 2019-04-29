package com.coffee;

public class Mocha extends Beverage {

	@Override
	public int cost() {
		return 7;
	}

	@Override
	public String getDescription() {
		return "Mocha";
	}
}