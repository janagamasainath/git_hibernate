package Strings;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java World";
		Entry<String, Long> entry = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(a->a.getValue()==1).findFirst().get();
System.out.println(entry);
	}

}
