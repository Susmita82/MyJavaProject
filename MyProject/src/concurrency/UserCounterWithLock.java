package concurrency;

import java.util.concurrent.locks.Lock;

public class UserCounterWithLock implements Runnable{

	private Lock lock;
	public UserCounterWithLock(Lock myLock){
		this.lock = myLock;
	}
	public void increment(){
		lock.lock();
		try{
		
			Counter.count++;		
			System.out.print( Counter.count + "  ");
		}finally{
			lock.unlock();
		}
	}
	
	public void run(){
		increment();
		increment();
		increment();
	}

}
