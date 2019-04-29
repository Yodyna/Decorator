package com.coffee;

public class Macchiato extends Beverage {

	@Override
	public int cost() {
		return 8;
	}

	@Override
	public String getDescription() {
		return "Macchiato";
	}

}
