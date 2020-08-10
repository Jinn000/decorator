package ru.zav.labs.decorator;

public abstract class Drinks {
	public enum Size {Small, Medium, Large};
	private Size mSize;
	private String mDescription;
	private int mQuantity;
	private int mTemterature;
	private int mPrice;


	public Drinks(Size size, int price, int temperature) {
		this.setDescription("Unknown");
		this.setSize(size);
		this.setPrice(price, size);
		this.setTemterature(temperature);
		this.setQuantity(1);
	}
	public Drinks() {
		this(Size.Small, 5, 60);
	}
	
	
	
	public abstract int cost();

	public int getQuantity() {
		return mQuantity;
	}
	public Size getSize() {
		return this.mSize;
	}
	public void setSize(Size size) {
		mSize = size;
	}
	
	public void setQuantity(int quantity) {
		mQuantity = quantity;
	}

	public int getTemterature() {
		return mTemterature;
	}

	public void setTemterature(int temterature) {
		mTemterature = temterature;
	}

	public String getDescription() {
		return mDescription;
	}

	public void setDescription(String description) {
		mDescription = description;
	}

	public int getPrice() {
		return mPrice;
	}

	public void setPrice(int price, Size size) {
		switch (size) {
		case Small:	
			this.mPrice = price;	
			break;
		case Medium:	
			this.mPrice = (int) (1.5 * price);	
			break;
		case Large:
			this.mPrice = 2 * price;	
			break;
		default: 
			this.mPrice = price;	
			break;
		}
	}
	
	
	

}
