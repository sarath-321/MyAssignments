package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] str= {"HCL","Wipro","Aspire Systems","CTS"};
		int length = str.length;
		List<String> list= new ArrayList<String>();
		for (int i = 0; i <length; i++) {
			list.add(str[i]);
		}
		Collections.sort(list);
		
		for (int i = list.size()-1; i>=0; i--) {
			//for ignoring "," in last value
			if(i!=0) {
			System.out.print(list.get(i)+",");}
			else {
				System.out.println(list.get(i));
			}
		}
	}
}
