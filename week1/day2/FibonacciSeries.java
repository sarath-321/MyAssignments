package week1.day2;

public class FibonacciSeries {

	/*Assignment 3
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * --->My learnings from this code...
	 * 
	 * 1)Sysout Print statement getting displayed
	 * 2)For loop opened with default i values
	 * 3)IF statement opened
	 * 
	 */

	public static void main(String[] args) {

		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int firstNum= 0;
		int secNum= 1;
		int range=8;
		int sum=0;

		// Print first number
		System.out.println(firstNum+" "+secNum);
		
		// Iterate from 1 to the range
		for (int i = 2; i <range; ++i) {
		// add first and second number assign to sum			
			sum= firstNum+secNum;
		// Assign second number to the first number	
			firstNum=secNum;
		// Assign sum to the second number	
			secNum=sum;
		// print sum
			System.out.println(" "+sum);	
		}
	}
}
