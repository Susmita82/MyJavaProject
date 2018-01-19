package lambdabuildinfuncinterface;

import java.util.Random;
import java.util.stream.Stream;

public class GenerateSupplier {

	public static void main(String[] args) {
		Random random = new Random();
		Stream.generate(random::nextBoolean)
		.limit(5)
		.forEach(System.out::println);
	}

}
