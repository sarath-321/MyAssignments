package week3.day2.polymorphism.assignment2;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student id :"+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student id :"+id+"\nStudent name :"+name);
	}
	public void getStudentInfo(String email, double phoneNumber) {
		System.out.println("Student emailId :"+email+"\nStudent phone number :"+phoneNumber);
	}
	public static void main(String[] args) {
		
		Students std= new Students();
		std.getStudentInfo(101);
		std.getStudentInfo(101,"Dora");
		std.getStudentInfo("dora@gmail.com", 4321567);
		

	}

}
