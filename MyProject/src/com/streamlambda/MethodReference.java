package com.streamlambda;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
	
	public static void printUpperCase(String string){
		System.out.println(string.toUpperCase());
	}

	public static void main(String[] args) {
		List<String> Strings = Arrays.asList("Hello", "Good", "Morning", "Richmond");
 
		//Strings.forEach(string -> System.out.println(string));
		
		Strings.forEach(System.out :: println); // using method reference
		
		Strings.forEach(MethodReference :: printUpperCase); // using method reference
		
	}

}
