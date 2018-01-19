package com.generics;

public class BoxPrinterTest {

	public static void main(String[] args) {
		
		BoxPrinter<Integer> boxPrinter = new BoxPrinter<Integer>(10);
		System.out.println(boxPrinter);
		
		BoxPrinter<String> boxPrinter2 = new BoxPrinter<String>("Hello Generic class");
		System.out.println(boxPrinter2);

	}

}
