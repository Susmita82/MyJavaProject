package com.test;

import java.util.ArrayList;
import java.util.List;

public class ListForEach {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");
		
		//Before java 8 normal for loop
		
		/*for( String item: items){
			System.out.println( "item : " + item);
		}*/
		
		// After java 8 loop a List with forEach + lambda expression 
		/*Performs the given action for each element of the Iterable 
		  until all elements have been processed or the action throws an exception.*/
		items.forEach(item->System.out.println( "item : " + item) );
		
		items.forEach(item -> { //block lambda
			if("C".equals(item)){
				System.out.println("Block Lambda code for Item matching " + item);
			}
		});
		
		//method reference
		//Output : A,B,C,D,E
		items.forEach(System.out::println); // TODO need to know it
		
		//Stream and filter
		//Output : B
		items.stream() 
			.filter(s->s.contains("B"))
			.forEach(System.out::println); //TODO

	}

}
