package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWALRemoveTest {

	public static void main(String[] args) {
		List<String> aList = new ArrayList<>();
		aList.add("1");
		aList.add("2");
		aList.add("3");
		
		System.out.println(aList.remove(1));	
		
		List<String> cowaList = new CopyOnWriteArrayList<>();
		cowaList.add("5");
		cowaList.add("6");
		cowaList.add("7");
		cowaList.add("8");
		// you can remove from the list but not at the time of iteration by for loop or Iterator.
		System.out.println(cowaList.remove(1));
	}

}
