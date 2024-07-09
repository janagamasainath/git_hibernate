package collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnwriteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new CopyOnWriteArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		Iterator<Integer> itr= al.iterator();
		while (itr.hasNext()) {
			al.add(7);
			Integer result = (Integer) itr.next();
			
			
			System.out.println(result);
		}
		
		

	}

}
