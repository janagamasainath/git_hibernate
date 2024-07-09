package Arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JoiningTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 6, 7, 8, 9, 10 };

		//12345678910
		int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
		System.out.println(Arrays.toString(array));
		
	}

}
