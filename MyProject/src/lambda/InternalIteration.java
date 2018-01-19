package lambda;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {

	public static void main(String[] args) {
		String [] strings = {"aa", "bb","cc"};
		List<String> names = Arrays.asList(strings);
		names.forEach(name -> System.out.println(name));
	}

}
