package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(3);
		al.add(2);
		al.add(5);
		al.add(4);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

		String str = "hello sainath how are you";

		String[] split = str.split(" ");
		for (String word : split) {
			StringBuilder ss = new StringBuilder(word);
			StringBuilder reverse = ss.reverse();
			System.out.print(reverse + " ");
		}

		ListReverse reve= new ListReverse();
		String reve2 = reve.reve(str);
		System.out.println(reve2+"");
	}

	// step 1
	public String reverse(String word) {
		char[] charArray = word.toCharArray();
		int left = 0;
		int right = 0;
		while (left < right) {
			char c = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = c;
			right++;
			left++;

		}

		return new String(charArray);

	}
	// step 3

	public String reve(String word) {
		String[] split = word.split(" ");
		StringBuilder ss = new StringBuilder(word);

		for (String ww : split) {
			StringBuilder append = ss.append(reverse(ww)).append("");

		}
		return ss.toString().trim();

	}

}
