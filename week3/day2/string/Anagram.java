package week3.day2.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";

		if (text1.length() == text2.length()) {

			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean bl = Arrays.equals(ch1, ch2);

			if (bl == true) {
				System.out.println("The provided strings " + "''" + text1 + "''" + " and " + "''" + text2 + "''"
						+ " are anagrams");
			} else {
				System.out.println("The provided strings " + "''" + text1 + "''" + " and " + "''" + text2 + "''"
						+ " are not anagrams");
			}

		} else {
			System.out.println("Length of the two strings are not same");
		}

	}
}
