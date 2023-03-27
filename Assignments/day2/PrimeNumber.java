package week1.day2;

import java.util.Iterator;

public class PrimeNumber {

	/*Assignment 2
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter 
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space+down arrow + enter
	 * 
	 * --->My learnings from this code...
	 * 
	 * 1)Sysout Print statement getting displayed
	 * 2)For loop opened with default i values
	 * 3)IF statement opened
	 * 
	 */

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13
		int input = 56;

		// Declare a boolean variable flag as false
		boolean flag = false;

		// Iterate from 2 to half of the input
		for (int i = 2; i <= input / 2; i++) {
			// Divide the input with each for loop variable and check the remainder
			if (input % 2 == 0) {
				// Set the flag as true when there is no remainder
				flag = true;
			}
			// break the iterator
			break;
		}
		// Check the flag (Provide a condition)
		if (flag == false) {
			// Print 'Prime' when the condition matches
			System.out.println("Prime");
		} else {
			// Print 'Not a Prime' when the condition doesn't match
			System.out.println("Not a Prime");
		}
	}
}
