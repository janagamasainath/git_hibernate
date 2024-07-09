package logic;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =6789;// 
		
		int sum = String.valueOf(a).chars().map(Character::getNumericValue).sum();
		System.out.println(sum);
	}

}
