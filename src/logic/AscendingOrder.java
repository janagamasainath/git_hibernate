package logic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Ascending order int [] a = {515, 341, 98}; //output :{551,431,98}
		int [] a = {515, 341, 98};
		List<String> collect = Arrays.stream(a).boxed().map(aa->aa+" ").collect(Collectors.toList());
		System.out.println(collect);
		
		int[] result = Arrays.stream(a)
	            .mapToObj(Integer::toString) // Convert to String
	            .map(s -> s.chars() // Convert to IntStream of chars
	                       .mapToObj(c -> (char) c) // Convert each int to char
	                       .sorted((c1, c2) -> Character.compare(c2, c1)) // Sort chars in descending order
	                       .map(String::valueOf) // Convert chars to String
	                       .collect(Collectors.joining())) // Join to form the new number string
	            .mapToInt(Integer::parseInt) // Convert back to int
	            .sorted() // Sort in ascending order
	            .toArray(); // Collect to array

	        // Print the result
	        System.out.println(Arrays.toString(result));
		
	        
	        Arrays.stream(a).mapToObj(Integer::toString)
	        .map(aa->aa.chars()
	        		.mapToObj(c->(char)c)).sorted((c1,c2)->Character.compare(c1, c2))
	        .map(String::valueOf)
	        .mapToInt(Integer::parseInt)
	        .sorted()
	        .toArray();
	}

}
