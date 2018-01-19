package concurrency;

public class UserCounter implements Runnable{
	
	public void increment(){
		synchronized(this){
		
			Counter.count++;		
			System.out.print( Counter.count + "  ");
		}
	}
	
	public void run(){
		increment();
		increment();
		increment();
	}
	
	

}
