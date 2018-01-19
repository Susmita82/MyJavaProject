package com.generics;

public class Pair<T1, T2> {

	private T1 val1;
	private T2 val2;
	
	public Pair(T1 t1, T2 t2){
		val1 = t1;
		val2 = t2;
	}
	
	public T1 getFirstVal(){
		return val1;
	}
	
	public T2 getSecondVal(){
		return val2;
	}
	
}
