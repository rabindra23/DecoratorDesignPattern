package com.masai.decorator;

public class Milk extends AddOn{

	public Milk(Beverage beverage) {
	    super(beverage);
	}

	@Override
	public String getDescription() {
	    return beverage.getDescription() + "+ Milk";
	}

	@Override
	public double cost() {
	    return 20 + beverage.cost();
	}
}
