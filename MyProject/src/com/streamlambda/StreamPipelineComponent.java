package com.streamlambda;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamPipelineComponent {

	public static void main(String[] args) {
		Method[] objectMethods = Object.class.getMethods();
		// get a stream by calling Arrays.stream(). this is the source of the stream
		Stream<Method> objectMethodStream = Arrays.stream(objectMethods); 
		/* Both map() and distinct() methods take a stream as input
		and return a (modified) stream as the output. These are Intermediate operations */
		Stream<String> objectMethodNames = objectMethodStream.map(method -> method.getName());
		Stream<String> uniqueObjectMethodNames = objectMethodNames.distinct();
       /* forEach() method on the stream is the terminal operation in the pipeline. */
		uniqueObjectMethodNames.forEach(System.out :: println);
	}

}
