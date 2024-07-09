package Arrays;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 5, 6, 4 ,1};
		int target = 9;

		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length; j++) {

				if (a[i] + a[j] == target) {
					System.out.println(a[i] + "  " + a[j]);

				}

			}
		}

	}

}
