package concurrency.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;

public class Consumer implements Runnable {

	private final BlockingQueue<Integer> sharedQueue;
	
	public Consumer(BlockingQueue<Integer> sharedQue){
		 this.sharedQueue = sharedQue;
	}
	public void run(){
		while(true){
			try{
				System.out.println("Consumed : " + sharedQueue.take());
				
			}catch(InterruptedException exp){
				Logger.getLogger(exp.getMessage());
			}
		}
	}
	
}
