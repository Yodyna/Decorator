package com.coffee.addon;

import com.coffee.Beverage;

public class Sugar extends AddonDecorator {

	public Sugar(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public int cost() {
		return decoratorCost();
	}

	@Override
	public String getDescription() {
		return decoratorDescription() + " with Sugar";
	}
}
