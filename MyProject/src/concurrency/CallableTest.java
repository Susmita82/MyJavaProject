package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) throws Exception {
		long N = 10;
		// get a callable task to be submitted to the executor service
		Callable<Long> task = new Factorial(N);
		// create an ExecutorService with a fixed thread pool having one thread
		ExecutorService es = Executors.newSingleThreadExecutor();
		// submit the task to the executor service and store the Future object
		Future<Long> Factorial= es.submit(task);
		// wait for the get() method that blocks until the computation is complete.
		System.out.printf("factorial of %d is %d", N, Factorial.get());
		// done. shutdown the executor service since we don't need it anymore
		es.shutdown();
		

	}

} 
