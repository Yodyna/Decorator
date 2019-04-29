package com.coffee.addon;

import com.coffee.Beverage;

public class Soy extends AddonDecorator {

	public Soy(Beverage beverage) {
		super(beverage);
	}

	@Override
	public int cost() {
		return decoratorCost() + 2;
	}
	
	@Override
	public String getDescription() {
		return decoratorDescription() + " with Soy";
	}
}
