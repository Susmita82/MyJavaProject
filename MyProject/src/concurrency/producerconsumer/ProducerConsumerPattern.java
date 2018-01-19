package concurrency.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerPattern {
	
	public static void main(String[] args) {
		
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();
		
		Thread producerThread = new Thread(new Producer(sharedQueue));
		//Producer doesn't need to know about who is consumer or how many consumers are there. Same is true with Consumer.
		//can introduce more consumer for better utilization
		Thread consumerThread = new Thread(new Consumer(sharedQueue));
		Thread consumerThread2 = new Thread(new Consumer(sharedQueue));
		
		producerThread.start();
		consumerThread.start();
		consumerThread2.start();
	}

}
