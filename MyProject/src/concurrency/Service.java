package concurrency;

import java.util.concurrent.CountDownLatch;

public class Service implements Runnable{
	
	private CountDownLatch latch;
	private String name;
	
	public Service(CountDownLatch latch, String name){
		this.latch = latch;
		this.name  = name;		
	}
	
	public void run(){
		
		try{
			
			Thread.sleep(300);
		}catch(InterruptedException exp){
			System.out.println("Interrupted Exception : " + exp.getMessage());
		}
		System.out.println( "Service " + this.name + "is up.");
		
		latch.countDown();  //reduce count of CountDownLatch by 1
		
	}

}
