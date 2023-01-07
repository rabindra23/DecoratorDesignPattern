package com.masai.decorator;

public class Sugar extends AddOn{

	public Sugar(Beverage beverage) {
	    super(beverage);
	}

	@Override
	public String getDescription() {
	    return beverage.getDescription() + "+ Sugar";
	}

	@Override
	public double cost() {
	    return 10 + beverage.cost();
	}
}
