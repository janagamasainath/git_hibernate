package Strings;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am a java developer and good programmer";
		String stratword="java";
		String endword="good";
		int s1 = str.indexOf(stratword);
		int s2 = str.lastIndexOf(endword)+endword.length();
		String substring = str.substring(s1, s2);
		System.out.println(substring);
		
	}

}
