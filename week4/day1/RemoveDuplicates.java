package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str = "PayPal India";
		char[] ch = str.toCharArray();
		// as per req
		// Set<Character> set= new HashSet<Character>();

		// for maintaining insertion order
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();

		for (int i = 0; i < ch.length; i++) {

			if (!charSet.add(ch[i])) {
				dupCharSet.add(ch[i]);
			}
		}

		System.out.println("Duplicates are :" + dupCharSet);

		charSet.removeAll(dupCharSet);
		
		System.out.print("After removing duplicates :");
		for (Character character : charSet) {
			if (character != ' ') {
				System.out.print(character);
			}
		}
	}
}
