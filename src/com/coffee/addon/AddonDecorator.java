package com.coffee.addon;
import com.coffee.Beverage;

abstract public class AddonDecorator extends Beverage {
	
	private Beverage beverage;
	
	public AddonDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public abstract int cost();
	public abstract String getDescription();
	
	int decoratorCost() {
		return beverage.cost();
	}
	
	String decoratorDescription() {
		return beverage.getDescription();
	}
	
	
}
