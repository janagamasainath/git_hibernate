package logic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 0, c = 1;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("enter the number");
		for (int i = 0; i <= n; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(" " + a);
		}

	}

}
