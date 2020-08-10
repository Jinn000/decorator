package ru.zav.labs.decorator;

import ru.zav.labs.decorator.Drinks.Size;

public class Order {

	public static void main(String[] args) {
		Drinks cup0 = new CoffeDrink(Size.Large);
		cup0 = new Milk(cup0, Size.Small);
		cup0 = new Milk(cup0, Size.Small);
		cup0 = new Sugar(cup0, Size.Small);
		System.out.println(cup0.getDescription() + ": $" + cup0.cost());

	}

}
