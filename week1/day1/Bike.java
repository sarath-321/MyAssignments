package week1.day1;

//Assignment 4- 
//Calling the methods of Car class in Bike class by creating object for Car class and Bike class
//Two object created for two class (Car and Bike)

/*Create package name as week1.day1 under src/main/java
- Create a  new class as "Car" under week1.day1
- Create 2 methods(applyBreak(),soundHorn())
applyBreak(){print as Applied break}
soundHorn(){print as sound horn}
-Create another class as Bike
-Call the methods of Car class in BikeClass by creating object for Car class and Bike Class
Hint Create two objects for the two classess
*/

public class Bike {

	public static void main(String[] args) {

		Bike bike = new Bike();
		Car car = new Car();

		car.applyBrake();
		car.soundHorn();

	}
}
