package com.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*This class will show how to convert array to list and vice versa*/
public class ArrayAndListConvertion {

	public static void main(String[] args) {
		
		Double [] temperatureArray = {31.1, 30.0, 32.5, 34.9, 33.7, 27.8};
		System.out.println("The original array is: " +Arrays.toString(temperatureArray));

		// convert list to array . asList() return a fixed size list from array 
		List<Double> temperatureList = Arrays.asList(temperatureArray);
		temperatureList.set(0, 35.2);
		System.out.println("The modified array is: " + Arrays.toString(temperatureArray));// return a string representation of list
		
		List<String> list = new ArrayList<String>(); 
		list.add("India"); list.add("Switzerland"); 
		list.add("Italy"); list.add("France"); 
		// convert list to array. toArray() return a fixed size array from list
		String [] countries = list.toArray(new String[list.size()]);
		
		System.out.println("Countries Array : " + Arrays.toString(countries));

	}

}
