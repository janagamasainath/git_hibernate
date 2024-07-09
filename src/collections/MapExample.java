package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<>();
		// Map<String, Integer> map = new HashMap<>();

		map.put("Ronaldo", 21);
		map.put("Messi", 17);
		map.put("Neymar", 20);
		//map.entrySet().stream().forEach(System.out::println);

		Map<String, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		// collect.forEach((key,value)->System.out.println(key+" "+value));

		LinkedHashMap<String, Integer> collect2 = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (w1, w2) -> w1, LinkedHashMap::new));
		// System.out.println(collect2);
		// collect2.forEach((key,value)->System.out.println(key+":"+value));

		int[] a = { 5, 1, 2 };
		int[] b = { 1, 3, 4 };
		int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();

		String string = Arrays.toString(array);
		// System.out.println(string);

		List<String> collect3 = Arrays.stream(string.split("")).collect(Collectors.toList());
		//System.out.println();
		Map<String, Integer> collect4 = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (w1,w2)->w1,LinkedHashMap::new));
		//System.out.println(collect4);
		
		
	}

}
