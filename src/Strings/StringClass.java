package Strings;

import java.util.Iterator;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="knowledge";
		str= str.concat("based");
		System.out.println(str);
		String ss="hello sainath how are you";
		String[] split = ss.split(" ");
		for(String word:split) {
			StringBuilder sb= new StringBuilder(word);
			System.out.print(" "+sb.reverse());
		}
		
	}
	
	//step 1
	public String reverses(String word) {
		char[] charArray = word.toCharArray();
		int left=0;
		int right= word.length()-1;
		while(left<right) {
			char temp = charArray[left];
			 charArray[left]=  charArray[right];
			 charArray[right]=temp;
			 left++;
			 right--;
		}
		return new String(charArray);
		
	}
	
	public String reverseWord(String words) {
		String[] split = words.split(" ");
		for (String wwww : split) {
			StringBuilder ssss= new StringBuilder(wwww);
			ssss.append(reverses(words)).append(" ");
		}
		return words;
		
	}

}
