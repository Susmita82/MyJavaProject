package lambdabuildinfuncinterface;

import java.util.Arrays;
import java.util.function.Function;

public class CombineFunctions {

	public static void main(String[] args) {
		/*
		 * Interface Function<T,R>
		 * Represents a function that accepts one argument and produces a result.
		 * This is a functional interface whose functional method is apply(Object).
		 */
		Function<String, Integer> parseInt = Integer::parseInt;
		Function<Integer, Integer> absInt = Math::abs;
		Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);
		
		Arrays.stream("4, -9, 16".split(", "))
		.map(parseAndAbsInt)
		.forEach(System.out::println);

	}

}
