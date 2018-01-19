package com.generics;

public class BoxPrinter <T> {
	private T val;
	
	public BoxPrinter(T t){
		val = t;		
	}

	@Override
	public String toString(){
		return " [ " + val + " ]";
	}
	
}
