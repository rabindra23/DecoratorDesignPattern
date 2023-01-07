package com.masai.decorator;

public abstract class AddOn extends Beverage{

	protected Beverage beverage;

	public AddOn(Beverage beverage) {
	    this.beverage = beverage;
	}

	public abstract String getDescription();
}
