package com.streamlambda;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10)
		.filter(i -> i % 2 == 0)
		.forEach(System.out :: println);
		
		//EvenSquars
		IntStream.rangeClosed(1, 10)		
        .filter(i -> (i % 2) == 0)
        .map(i -> i * i)        
        .forEach(i -> System.out.printf (" %d " , i));
		
		//get max value of the Intstream		
		OptionalInt maxVal = IntStream.rangeClosed(10, 20)		
        .filter(i -> (i % 2) == 0)
        .map(i -> i * i)        
        .max();
		System.out.println( "\n max value  : " + maxVal.getAsInt());
}

}
