package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {

		int[] data = { 1, 4, 3, 3 };
		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int i = 0; i < data.length; i++) {
			ts.add(data[i]);
		}

		List<Integer> list = new ArrayList<Integer>(ts);
		int missingNum = 0;
		for (int i = 0; i < list.size(); i++) {

			missingNum = i + 1;
			if (list.get(i) != missingNum) {
				System.out.println(missingNum);
				break;
			}
		}
	}
}
