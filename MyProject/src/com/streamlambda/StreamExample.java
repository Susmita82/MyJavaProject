package com.streamlambda;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		// source of the stream
		//IntStream intStreams = IntStream.range(1, 6);
		IntStream intStreams = IntStream.iterate(3, i -> i +1).limit(5);
		
		// Terminal Operation
		intStreams.forEach(System.out :: println);
		
		Stream<String> streams = Stream.of("A" , "B", "C" , "D");
		streams.forEach(System.out :: println);
		
		new Random().ints().limit(3).forEach(System.out::println);
		
		"hello".chars().sorted().forEach(ch -> System.out.printf("%c", ch));
		
		Pattern.compile(" ").splitAsStream("java 8 streams").forEach
		(System.out::println);
		
		/* stream pipeline is processing the elements one by one.
           Each element is mapped to its square value. 
           The peek() method helps us understand how the stream is
           processing the elements.*/
		Stream.of(1, 2, 3, 4, 5)
		.peek(i -> System.out.printf(" %d " , i))
		.map(j -> j*j)
		.peek(k -> System.out.printf(" %d ", k))
		.count(); // terminal operation
		

	}

}
