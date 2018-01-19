package concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class RaceCondition {

	public static void main(String[] args) {
		
		// this is not right thread because here creating different instance for different
		//thread
		
		/*UserCounter uCount1 = new UserCounter();
		UserCounter uCount2 = new UserCounter();
		UserCounter uCount3 = new UserCounter();
		Thread t1 = new Thread(uCount1);
		Thread t2 = new Thread(uCount2);
		Thread t3 = new Thread(uCount3);*/
		
		//in multi-threading two or more tasks executing concurrently within a single program. 
		UserCounter uCount = new UserCounter();	
		
		//lock is alternative of sychronization.
		//UserCounterWithLock uCount = new UserCounterWithLock(new ReentrantLock());
		Thread t1 = new Thread(uCount);
		Thread t2 = new Thread(uCount);
		Thread t3 = new Thread(uCount);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
