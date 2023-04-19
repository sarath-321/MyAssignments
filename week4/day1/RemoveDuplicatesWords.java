package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		Set<String> hashSet= new LinkedHashSet<String>();
		
		for (int i = 0; i < split.length; i++) {
			hashSet.add(split[i]);
		}
		
        List<String> arr= new ArrayList<String>(hashSet);
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}	
	}
}
