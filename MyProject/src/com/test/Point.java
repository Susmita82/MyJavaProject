package com.test;

import java.util.HashSet;
import java.util.Set;


public class Point {

	private int xPos, yPos;
	
	public Point(int x, int y) {
	xPos = x;
	yPos = y;
	}
	
public int getX(){
	return xPos;
}

public int getY(){
	return yPos;
}
	
	@Override
	public boolean equals(Object other){
		if (other == null) return false;
		if (this == other) return true;
		if (other instanceof Point){
			Point otherPoint = (Point)other;
			if (xPos == otherPoint.xPos && yPos == otherPoint.yPos  ){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		// use bit-manipulation operators such as ^ to generate close to unique
		// hash codes here we are using the magic numbers 7, 11 and 53,
		// but you can use any numbers, preferably primes
		
		return (7 * xPos) ^ (11 * yPos);
	}
	
	@Override
	public String toString(){
		return ("x = " + xPos + " y = " + yPos);
	}
	
		
	public static void main(String[] args) {
				
		Object p1 = new Point(10, 20); 
		Object p2 = new Point(50, 100);
		Object p3 = new Point(10, 20);
		System.out.println("p1 equals p2 is " + p1.equals(p2));
		System.out.println("p1 equals p3 is " + p1.equals(p3));
		
		Set<Point> pointList = new HashSet<Point>();
		//List<Point> pointList = new ArrayList<Point>();
		//pointList.add(new Point(10,20));
		Point p4 = new Point(10, 20);
		Point p5 = new Point(10, 20);
		pointList.add(p4);
		System.out.println( pointList.contains(p5));				
		
		// String interning
		String str1 = new String ("content");
		String str2 = new String ("content");
		
		System.out.println("str1 == str2  : " + str1 == str2);
		System.out.println("str1.equals(str2)  : " + str1.equals(str2));
		System.out.println("str1.intern() == str2.intern()  : " + (str1.intern() == str2.intern()) );
					
	}
	
	public static void printHello(){
		Circle c1 = new Circle(10, 20);
		Circle.test();
		c1.nonStaticTest();
	}

}
