package logic;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Random random = new Random();
	        
	        List<Integer> randomNumbers = random.ints(5, 100, 150)
	            .boxed()
	            .sorted()
	            .collect(Collectors.toList());

	        randomNumbers.forEach(System.out::println);
	    }

}
