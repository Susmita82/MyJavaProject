package concurrency.producerconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.logging.Logger;

public class Producer implements Runnable{

	private final BlockingQueue<Integer> sharedQueue;
	
	public Producer(BlockingQueue<Integer> sharedQue){
		this.sharedQueue = sharedQue;
	}
	
	@Override
	public void run(){
		try{
			for(int i = 0 ; i < 10 ; i ++){
				System.out.println( "Produce : " + i );
				sharedQueue.put(i);
			}
		}catch(InterruptedException exp){
			Logger.getLogger(exp.getMessage());
		}
	}
}
