package com.streamlambda;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;


public class StreamReuse {

	public static void main(String[] args) {
		// Convert Stream to Array[] 
		Object[] words = Pattern.compile( " ").splitAsStream("1 2 3 4 5 6").toArray();
       // Covert Array[] to Stream again and done the sum on the stream
		Integer sumValue =  Arrays.stream(words)
				            .mapToInt(str -> Integer.valueOf((String)str))
				            .sum();
       System.out.println( " Sum Value : " + sumValue);
       
       // Reuse is not possible of a consumed stream
       IntStream chars = "Bookkeep".chars();
       System.out.println( " count  : " + chars.count());// terminal operation is called on the stream
       // no farther operation on the consumed stream is not possible
       chars.distinct().sorted().forEach(ch -> System.out.printf("%c ", ch));
       
	}

}
