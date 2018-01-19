package concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Player extends Thread{

	private CyclicBarrier waitPoint;
	
	public Player(CyclicBarrier barrier, String name){
		this.setName(name);
		waitPoint = barrier;
		this.start();
		
	}
	
	public void run(){
		System.out.println("Player " + this.getName() + " is ready");
		try{
			//Waits until all parties have invoked await on this barrier. 
			//If the current thread is not the last to arrive then it is disabled for 
			//thread scheduling purposes and lies dormant until one of the following things happens:
			waitPoint.await(); 

		}catch(BrokenBarrierException | InterruptedException exp){
			System.out.println("An exception occure while waiting .." + exp);
		}
	}
	
}
