package com.coffee.addon;

import com.coffee.Beverage;

public class Milk extends AddonDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public int cost() {
		return decoratorCost();
	}
	
	@Override
	public String getDescription() {
		return decoratorDescription() + " with Milk"; 
	}
}
