package com.decorator;

public class CheesePizza extends Pizza {
	private int price = 6;
	public int getPrice(){
		price = price + (this.decorator != null ? this.decorator.getPrice() : 0);
		return price;
	}
}
