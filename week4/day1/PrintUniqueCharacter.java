package week4.day1;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {

		String str = "sarath";
		char[] ch = str.toCharArray();
		// as per req
		// Set<Character> set= new HashSet<Character>();

		// for maintaining insertion order
		Set<Character> set1 = new LinkedHashSet<Character>();

		for (int i = 0; i < ch.length; i++) {
			set1.add(ch[i]);
		}

		for (Character character : set1) {
			System.out.print(character);

		}
	}
}
