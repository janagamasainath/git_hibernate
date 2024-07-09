package Strings;

import java.util.Arrays;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s={"hyderabad","secunderabad","kaithabad"};
	String longest = Arrays.stream(s).reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
	System.out.println(longest);

	}

}
