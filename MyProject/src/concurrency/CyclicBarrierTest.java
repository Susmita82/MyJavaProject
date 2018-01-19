package concurrency;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		System.out.println("Court is reserved for four player \n Once all of them are present game will start..");

		CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
		new Player(barrier , "John");
		new Player(barrier , "Tom");
		new Player(barrier , "Ruby");
		new Player(barrier , "Max");
	}

}
