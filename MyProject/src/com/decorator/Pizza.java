package com.decorator;

public class Pizza implements PizzaInterface{
	private int price = 5;
	protected PizzaDecorator decorator;
	public int getPrice(){
		price = price + (this.decorator != null ? this.decorator.getPrice() : 0);
		return price;
	}
	public void addTopings(PizzaDecorator decorator){
		this.decorator = decorator;
	}
}
