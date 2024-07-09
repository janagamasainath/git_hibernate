package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "sainath how are ";

		// Occurence of each character
		Map<String, Long> collect = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		// System.out.println(collect);

		
		Entry<String, Long> entry = collect.entrySet().stream().filter(a -> a.getValue() == 1).findFirst().get();
		System.out.println("fisrtnon  "+entry);
		// Remove the duplicates charaters
		List<Entry<String, Long>> collect2 = collect.entrySet().stream().filter(a -> a.getValue() == 1)
				.collect(Collectors.toList());
		System.out.println(collect2);

		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}
		}

		System.out.println(map);
		
	}

}
