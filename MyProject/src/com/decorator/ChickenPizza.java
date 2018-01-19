package com.decorator;

public class ChickenPizza extends Pizza {
	private int price = 7;
	public int getPrice(){
		price = price + (this.decorator != null ? this.decorator.getPrice() : 0);
		return price;
	}
}
