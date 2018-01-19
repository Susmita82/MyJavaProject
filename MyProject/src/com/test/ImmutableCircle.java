package com.test;

//ImmutableCircle is a immutable class - the value or sate of this object cannot be modified
// once the object is created
public final class ImmutableCircle {

	private final Point center;
	private final int radius;
	
	//initialized the final members/fields inside the constructor
	public ImmutableCircle(int x, int y, int r){
		center = new Point(x, y);
		radius = r;
	}
	
	public int getRadius(){
		return radius;
	}
	public Point getCenter(){
		return new Point(center.getX() , center.getY());
	}
	
	@Override
	public String toString(){
		return ( center + " r = " + radius);
	}
	
		
	public static void main (String []args){
		System.out.println(new ImmutableCircle(10,10,5));
	}
	
}
