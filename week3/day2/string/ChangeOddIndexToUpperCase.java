package week3.day2.string;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		char[] ch = test.toCharArray();
		String str = "";

		for (int i = 0; i < ch.length; i++) {

			if (i % 2 != 0) {
				str = str + Character.toUpperCase(ch[i]);
			} else {
				str = str + ch[i];
			}
		}
		System.out.println("Converted string is "+str);
	}
}
