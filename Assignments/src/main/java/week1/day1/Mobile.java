package week1.day1;

/*Assignment 2:

- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console 
*/

public class Mobile {

	public void makeCall() {
		String mobileModel= "SAMSUNG M20";
		float mobileWeight= 186.2f;
		System.out.println("Calling my friend");
		System.out.println("Mobile model :"+mobileModel);
		System.out.println("Mobile weight :"+mobileWeight);
	}

	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost= 15000;
		System.out.println("Sending Msg");
		System.out.println("Is Full Charged :"+isFullCharged);
		System.out.println("Mobile cost :"+mobileCost);
	}

	public static void main(String[] args) {

		Mobile mobile = new Mobile();
		mobile.makeCall();
		mobile.sendMsg();
		System.out.println("This is my mobile");
		

	}

}
