package lambdabuildinfuncinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfMethod {

	public static void main(String[] args) {
		List<String> greet = new ArrayList<String>();
		greet.add("hello");
		greet.add("world");
		
		//greet.removeIf(str -> !str.startsWith("h"));
		greet.removeIf(((Predicate<String>)str -> str.startsWith("h")).negate());
		greet.forEach(System.out :: println);
	}

}
