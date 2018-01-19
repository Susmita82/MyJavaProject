package concurrency;

public class ThreadRunnable implements Runnable {

	public void run(){
		
		System.out.println("Inside run () thread name is : "+ Thread.currentThread().getName());
	}
	public static void main(String[] args) throws Exception {
		Thread newThread = new Thread(new ThreadRunnable());
		newThread.start();
		System.out.println("Inside main () thread name is : " + Thread.currentThread().getName());
		

		
	}

}
