package Arrays;

public class SumOfIntegersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123456;
		
		int sumOgDigits = sumOgDigits(a);
		System.out.println(sumOgDigits);
		

	}
	public static int sumOgDigits(int number) {
		
		String valueOf = String.valueOf(number); // convert to int
		int sum = 0;
		for (int i = 0; i < valueOf.length(); i++) {
			
		sum+= Character.getNumericValue(valueOf.charAt(i));
		}
		return sum;
		
	}

}
