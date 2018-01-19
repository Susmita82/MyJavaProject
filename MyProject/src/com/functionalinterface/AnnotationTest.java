package com.functionalinterface;

@FunctionalInterface
public interface AnnotationTest {
	
	int foo();
//	int foo2 ();
 default int foo(int i){
	 return i;
 }
}
