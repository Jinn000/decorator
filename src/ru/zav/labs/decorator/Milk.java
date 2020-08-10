package ru.zav.labs.decorator;

public class Milk extends ComponentDecorator {
	private Drinks drink;
	private static final int  COST_OF_ITEM = 1;
	
	public Milk( Drinks drnk, Size size, int price, int qty) {
		this.drink = drnk;
		this.setQuantity(qty);
		this.setPrice(price, size);
		this.setDescription("Milk");
	}
	public Milk(Drinks drnk, Size size) {
		this(drnk, size, COST_OF_ITEM, 1);
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return new String(drink.getDescription() + " + " + "Milk");
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return drink.cost() + this.getPrice();
	}

}
