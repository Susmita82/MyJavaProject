package lambdabuildinfuncinterface;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		/*
		 * Interface Predicate<T>
		 * Represents a predicate (boolean-valued function) of one argument
		 * This is a functional interface whose functional method is test(Object).
		 */
		Predicate<String> nullcheck = arg -> arg!= null;
		Predicate<String> emptycheck = arg -> arg.length() > 0;
		Predicate<String> nullAndEmptyCheck = nullcheck.and(emptycheck);
		
		String helloStr = "hello";
		System.out.println("" + nullAndEmptyCheck.test(helloStr));// Predicate has and(); or (), nagate(), test()
		
		String nullStr = null;
		System.out.println( "" + nullAndEmptyCheck.test(nullStr));

	}

}
