package com.coffee.addon;

import com.coffee.Beverage;

public class Choccolate extends AddonDecorator {

	public Choccolate(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public int cost() {
		return decoratorCost() + 1;
	}

	@Override
	public String getDescription() {
		return decoratorDescription() + " with Choccolate";
	}
}
