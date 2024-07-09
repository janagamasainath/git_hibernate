package Strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="sainath how are you";
		String[] split = str.split(" ");
		for (String word : split) {
			StringBuilder s = new StringBuilder(word);
			StringBuilder reverse = s.reverse();
			System.out.print(" "+reverse);
		}
		
		char[] charArray = str.toCharArray();
		System.out.println();
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.print(charArray[i]);
		}
		
		
		
		
		
	}

}
