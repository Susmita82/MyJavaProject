package concurrency;

public class ThreadWithClass extends Thread {

	public void run(){
		try{
			sleep(1000);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("Inside run () thread name is : " + getName());
	}
	public static void main(String[] args) {
		ThreadWithClass myThread = new ThreadWithClass();
		myThread.start();
		System.out.println("Inside main () thread name is :" + currentThread().getName());

	}

}
