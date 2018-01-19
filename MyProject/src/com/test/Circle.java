package com.test;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int rad){
		radius = rad;
	}
	public Circle(int x, int y){
		// invoke one constructor from the body of another constructor using this
		this(x);
	}
	public double area(){
		return Math.PI * radius * radius;
	}
	
	public static void test(){
		System.out.println("Inside static test");
	}
	
   public void nonStaticTest(){
	   Circle.test();
	   System.out.println("Inside nonStaticTest");
	}

}
