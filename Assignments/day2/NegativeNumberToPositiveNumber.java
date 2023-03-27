package week1.day2;

/*Assignment:4 
=========
Problem statement: Convert a negative number to positive number*/

public class NegativeNumberToPositiveNumber {

	public static void main(String[] args) {

		int num = -40;
		int num1=num;

		if (num < 0) {
			num = num * -1;
			System.out.println("The number "+num1+" is converted to "+num);
		} else {
			System.out.println("You entered positive number :" + num);
		}

	}

}
