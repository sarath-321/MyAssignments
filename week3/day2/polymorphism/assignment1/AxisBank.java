package week3.day2.polymorphism.assignment1;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Deposit Amount from Axis Bank");
	}
	
	public static void main(String[] args) {
		
		AxisBank ab= new AxisBank();
		ab.deposit();

		
	}

}
