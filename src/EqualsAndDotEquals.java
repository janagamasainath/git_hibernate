
public class EqualsAndDotEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stubing 
		String s="sainath";
		String s1="sainath";
		String s2 = new String("sainath");
		String s3= new String("sainath");
		boolean equals = s1.equals(s1);
		boolean equals2 = s2.equals(s3);
		System.out.println(equals);
		System.out.println(equals2);
		if (s==s1) {
			System.out.println("vvvvvvvv");
		}if (s2==s3) {
			System.out.println("bbbbbbbbbb");
		}
				

	}

}
