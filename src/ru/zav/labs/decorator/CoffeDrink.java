package ru.zav.labs.decorator;

public class CoffeDrink extends Drinks {
	private static final int  COST_OF_ITEM = 8;
	private static final int  TEMP_HOT_VALUE = 60;

	public CoffeDrink(Size size, int price, int temperature) {
		super(size, price, temperature);
		this.setDescription("Coffe");
	}
	
	public CoffeDrink(Size size) {
		this(size, COST_OF_ITEM, TEMP_HOT_VALUE);
	}
	
	@Override
	public int cost() {
		return this.getPrice() * this.getQuantity();
	}

}
