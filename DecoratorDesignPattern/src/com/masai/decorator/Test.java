package com.masai.decorator;

public class Test {

	public static void main(String[] args) {
		Beverage houseBlend = new HouseBlend();
	    System.out.println(houseBlend.getDescription() +  houseBlend.cost());

	    Beverage darkRoast = new DarkRoast();
	    System.out.println(darkRoast.getDescription() +  darkRoast.cost());

	    Beverage houseBlendWithMilk = new Milk(new HouseBlend());
	    System.out.println(houseBlendWithMilk.getDescription() +  houseBlendWithMilk.cost());

	    Beverage houseblendWithMilkAndSugar = new Sugar(new Milk(new HouseBlend()));
	    System.out.println(houseblendWithMilkAndSugar.getDescription() +  houseblendWithMilkAndSugar.cost());


	    Beverage darkRoastWithMilkAndSugar = new Sugar(new Milk(new DarkRoast()));
	    System.out.println(darkRoastWithMilkAndSugar.getDescription() +  darkRoastWithMilkAndSugar.cost());

	}

}
