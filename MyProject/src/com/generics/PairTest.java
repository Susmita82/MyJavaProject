package com.generics;

public class PairTest {

	public static void main(String[] args) {
		Pair<Integer, String> worldcup = new Pair<Integer,String>(2018, "Russia");
		/* Diamond syntax which allow the compiler to infer the type from the type declaration*/
		Pair<Integer, String> worldcup2 = new Pair<>(2018, "Russia");
		System.out.println("World cup " + worldcup.getFirstVal() + " in " + worldcup.getSecondVal());

	}

}
