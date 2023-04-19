package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		TreeSet<Integer> ts= new TreeSet<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			ts.add(data[i]);
		}
		
		List<Integer> list= new ArrayList<Integer>(ts);
		System.out.println("Second last element from the list is :"+list.get(list.size()-2));

	}

}
