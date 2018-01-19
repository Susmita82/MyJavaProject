package concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

	private final ReentrantLock lock = new ReentrantLock();
	private int count = 0;

	//Locking using Lock and ReentrantLock
    public int getCount() {
       lock.lock();
       try {
           System.out.println(Thread.currentThread().getName() + " gets Count: " + count);
           return count++;
       } finally {
           lock.unlock();
       }
    }


  //Implicit locking using synchronized keyword
    public synchronized int getCountTwo() {
           return count++;
    }

	
	public static void main(String[] args) {
		final ReentrantLockTest counter = new ReentrantLockTest();
        Thread t1 = new Thread("First") {

            @Override
            public void run() {
                while (counter.getCount() < 6) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();                    }
                }
            }
        };
      
        Thread t2 = new Thread("Second") {

            @Override
            public void run() {
                while (counter.getCount() < 6) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };

        t1.start();
        t2.start();

	}

}