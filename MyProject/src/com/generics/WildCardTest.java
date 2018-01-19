package com.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {

	public static void printList(List<?> lst){ // wild card used
	
		for(Object element : lst){
			System.out.println( "[ " + element + " ] ");
		}
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		printList(list);
		List<String> list1 = new ArrayList<>(); // Diamond syntax
		list1.add("Hello");
		list1.add("World");
		printList(list1);
		
		/* when you use wildcard parameters, you cannot call methods that modify the object. 
		 * you can call methods that access the object.*/
		
		//List<?> list2 = new ArrayList<Integer>();
		//list2.add(new Integer(10)); // compilation error : add method is not applicable for the argument
		
	}

}
