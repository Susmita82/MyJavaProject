package com.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		ChickenPizza chickenPizza = new ChickenPizza();
		System.out.println("Price of chicken pizza = " + chickenPizza.getPrice());
		chickenPizza.addTopings(new JelapinoToppings());
		System.out.println("Price of chicken pizza with Jalapino Topings = " +chickenPizza.getPrice());
		chickenPizza.addTopings(new JelapinoToppings());
		System.out.println("Price of chicken pizza with extra Jalapino Topings = " +chickenPizza.getPrice());
		chickenPizza.addTopings(new OliveToppings());
		System.out.println("Price of chicken pizza with extra Jalapino Topings and Olive topings = " +chickenPizza.getPrice());
		chickenPizza.addTopings(new OliveToppings());
		System.out.println("Price of chicken pizza with extra Jalapino Topings and extra Olive topings = " +chickenPizza.getPrice());

	}

}
