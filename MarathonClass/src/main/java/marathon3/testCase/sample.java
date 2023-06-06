package marathon3.testCase;

class Animal{
	String color="white";
}
class Dog extends Animal{
	String color="black";
	void print() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class sample {
public static void main(String[] args) {
	Dog d= new Dog();
	d.print();
	
	
}
}
