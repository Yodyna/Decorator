package com;
import com.coffee.Decaf;
import com.coffee.addon.Carmel;
import com.coffee.addon.Soy;
import com.coffee.addon.Sugar;

public class Main {

	public static void main(String[] args) {

		Decaf decaf = new Decaf();
		Carmel carmel = new Carmel(decaf);
		
		Soy soy = new Soy(carmel);
		Sugar sugar = new Sugar(soy);
		
		System.out.println(sugar.getDescription() + " " + sugar.cost());
	}
}
