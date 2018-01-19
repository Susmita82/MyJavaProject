package com.decorator;

public interface PizzaInterface {
	public int getPrice();
	public void addTopings(PizzaDecorator decorator);
}
