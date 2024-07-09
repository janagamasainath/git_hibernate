package logic;

public class Palindrome {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sainath how are you";
		
		StringBuilder ss = new StringBuilder(str);
		StringBuilder reverse = ss.reverse();
		
		boolean equals = str.equals(reverse);
		System.out.println(equals);
		
		String[] split = str.split("");
		String rev;
		for (int i = split.length-1; i >=0; i--) {
			 rev = split[i];
			 System.out.print(rev );
		}
		
		


		

	}

}
