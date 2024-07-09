package Arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

//Consider an array of 10 integers
//call it nums, and on being given a target number, verify if the target is present as a sum of 2 integers within the array
public class ArraysExample {

       public static void main(String[] args) {
    	   int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			   
    	   int target= 16;
    	   Set<Integer> seen = new HashSet<>();
    	   IntStream.of(a).forEach(n->{
    		   int component= target-n;
    		   
    		   if (seen.contains(component)) {
				//System.out.println("pair found :"+ component + " "+ n);
				
			}
    		   seen.add(n);
    		   
    	   });
    	   
    	   
       }
	}






