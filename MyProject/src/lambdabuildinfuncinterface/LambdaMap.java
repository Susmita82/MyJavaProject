package lambdabuildinfuncinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaMap {

	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "aaa1");
		map.put("bbb", "bbb2");
		map.put("ccc", "ccc3");
		map.put("ddd", "ddd4");
		map.put("eee", "eee5");
		//print the values of map using lambda
		// map.values().stream().forEach(System.out :: println);
		//List<String> valueList = map.values().stream().collect(Collectors.toList()); 
		
		//get a value for matching key from the map using lambda
		 map.entrySet().stream()
		 .filter(e -> e.getKey().equals("aaa"))
		 .map(e -> e.getValue())
		 .forEach(System.out :: println);
		

	}

}
