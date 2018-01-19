package concurrency;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWAList {

	public static void main(String[] args) {
		List<String> aList = new CopyOnWriteArrayList<>();
		aList.add("1");
		aList.add("2");
		aList.add("3");
		
		Iterator<String>  listIter = aList.iterator();
		while(listIter.hasNext()){
			String num = listIter.next();
			System.out.println(num);
			//you cannot call the remove() method on an Iterator of a CopyOnWriteArrayList: 
			//it always throws the UnsupportedOperationException.
			/*if("3".equals(num)){
				listIter.remove();  
			}*/
			aList.add("4");
			
		}
		/*o/p: 1 2 3 // here iterator hold the old reference of the list before modification. 
		so 4 is not there even if it added 3 times.*/
		
		Iterator<String>  listIter2 = aList.iterator();
		while(listIter2.hasNext()){
			System.out.println(listIter2.next());
			
		} // o/p :  1 2 3 4 4 4

	}

}
