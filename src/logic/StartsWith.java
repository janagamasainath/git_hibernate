package logic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aa={1,2,3,4,5,11,22,13,65};
		
		List<String> collect = Arrays.stream(aa).boxed().map(a->a+"").filter(a->a.startsWith("1")).collect(Collectors.toList());
System.out.println(collect);
	}

}
