package concurrency;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Long>{
	
	private long val;
	public Factorial(long num){
		val = num;
	}
	@Override
	public Long call() throws Exception{
		long factVal = 1;
		
		if(val <= 0){
			throw new Exception("Factorial number sgoud be grater then 0");
		}else{
			for(long i = 1; i <= val ; i ++){
				factVal = i * factVal;
			}
		}
		
		return factVal;
	}

}
