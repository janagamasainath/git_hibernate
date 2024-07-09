package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();
		map.put("sainath", 1);
		map.put("saritha", 2);
		map.put("pranvi", 3);
		map.put("shreyansh", 4);
		map.put(null, 5);
		map.put("bujji", null);
		map.put(null, 10);
		map.put("shreyansh", 10);
		map.put("shreyansh", 12);
		map.put("sainath", null);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			//System.out.println(key+"  "+val);
			
			
		}
		//using lambda expression
		map.forEach((key,value)->System.out.println(key+" "+value));
	}

}
