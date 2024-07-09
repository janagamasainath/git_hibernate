package Arrays;

import java.util.Iterator;
import java.util.stream.IntStream;

public class PositionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,10,9,15,12};

		// position
	for (int i = 0; i < a.length; i++) {
		if (a[i]==10) {
			System.out.println("posion of "+  a[i]+" is "+ i);
		}
	}
	
	//sum of two number is 10
	int target =10;
	for (int i = 0; i < a.length-1; i++) {
		for (int j = 0; j < a.length; j++) {
			if (a[i]+a[i]==target) {
				System.out.println(i+"   "+j);
			}
			
		}
	}
	}

}
