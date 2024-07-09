package collections;

import java.util.HashMap;
import java.util.Map;

public class ConcurentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String, Integer> map = new HashMap<String, Integer>();
map.put("sainath", 0);
map.put("saritha", 20);
map.put("pranvi", 10);
map.put("anil", 15);
map.put(null, null);

for(Map.Entry<String, Integer> a: map.entrySet()) {
	String key = a.getKey();
	Integer value = a.getValue();
	
	//map.put("shreyansh", 5);
	
	//System.out.println(key+"  "+value);
}

map.forEach((key,val)->System.out.println(key+"   "+val));
	}

}
