package Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonStringTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1= {"apple" ,"banana","mango","papaya"};
		String[] s2= {"orange","papaya","banana"};
		
		List<String> list1 = Arrays.asList(s1);
		
		 List<String> list2 = Arrays.asList(s2);
		 List<String> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());
		 System.out.println(collect);
		 
	}

}
