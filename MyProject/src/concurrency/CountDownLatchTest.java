package concurrency;

import java.util.concurrent.CountDownLatch;


public class CountDownLatchTest {

	
	public static void main(String[] args) {
		System.out.println("Once all the service will up application will start..");

		CountDownLatch latch = new CountDownLatch(4);
		Thread validService= new Thread(new Service(latch , "ValivationService"));
		Thread cacheService= new Thread(new Service(latch , "CacheService"));
		Thread alterService= new Thread(new Service(latch , "AlterService"));
		Thread freeService= new Thread(new Service(latch , "FreeService"));
		
		validService.start();
		cacheService.start();
		alterService.start();
		freeService.start();
		
		
		 try{
	            latch.await();  //main thread is waiting on CountDownLatch to finish
	            System.out.println("All services are up, Application is starting now");
	       }catch(InterruptedException ie){
	           ie.printStackTrace();
	       }			
				
	}
	
	
		
		
	
	
}
