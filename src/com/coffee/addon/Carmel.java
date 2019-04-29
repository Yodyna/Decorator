package com.coffee.addon;
import com.coffee.Beverage;

public class Carmel extends AddonDecorator{
		
	public Carmel(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public int cost() {
		return decoratorCost() +  1;
	}

	@Override
	public String getDescription() {
		return decoratorDescription() + " with Carmel";
	}

	@Override
	public String toString() {
		return "Carmel [getDescription()=" + getDescription() + ", cost()=" + cost() + ", decoratorDescription()="
				+ decoratorDescription() + ", decoratorCost()=" + decoratorCost() + "]";
	}
}
