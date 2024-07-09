package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NthHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,6,2,9,3,8,4,6,5};
Integer second = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
System.out.println(second);
	}

}
