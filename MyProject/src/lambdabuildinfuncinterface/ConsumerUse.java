package lambdabuildinfuncinterface;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerUse {

	public static void main(String[] args) {
		Stream<String> streams = Stream.of("hello" , "world");
		Consumer<String> printString =System.out :: println;
		streams.forEach(printString);
   
	}

}
