
package Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SquareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] aa = {7,8,9,10,12,16};
		 int[] array = Arrays.stream(aa).map(a->a*a).toArray();
		// Arrays.stream(array).forEach(System.out::println);
		 Arrays.stream(array).filter(a->a>100).forEach(System.out::println);
		
	}

}
