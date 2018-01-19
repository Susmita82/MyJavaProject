package com.test;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {
	
	public static void main (String []args){
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
	
		// before java 8 iteration code
		
		/*Set<Map.Entry<K,V>> entrySet(). entrySet Returns a Set view of the mappings contained in this map. 
		The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.*/ 
		/*for (Map.Entry<String, Integer> entry : items.entrySet()) {
			if ("D".equals(entry.getKey())){
				entry.setValue(80);
			}
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
			
		}*/
		
		// After java 8 iteration code with  "forEach" + lambda expression
		
		/*forEach -> Performs the given action for each entry in this map until all entries have been 
		 processed or the action throws an exception.*/ 
		items.forEach((k,v)->System.out.println("Item (Key) : " + k + " Count(value) : " + v));

		items.forEach((k,v)->{
			System.out.println("Item : " + k + " Count : " + v);
			if("E".equals(k)){
				System.out.println("Hello E");
			}
		});
		
	}

}
