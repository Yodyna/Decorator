package com.coffee;

public class Decaf extends Beverage {

	@Override
	public int cost() {
		return 7;
	}

	@Override
	public String getDescription() {
		return "Decaf";
	}
}
