package week3.day2.string;

public class Palindrome {

	public static void main(String[] args) {
		
		String str= "madam";
		String rev= "";
		char[] ch= str.toCharArray();
		
		for (int i = ch.length-1; i>=0 ; i--) {
			rev=rev+ch[i];
		}
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}
		

	}

}
