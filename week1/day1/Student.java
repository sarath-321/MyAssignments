package week1.day1;

/* Assignment 5
 * Create Class Student
declare variables
studentName
rollNo
collegeName
markScored
cgpa

Create a class Report and create object for student class in main method and print all the variables*/

public class Student {
	
	String studentName= "Sara";
	int rollNo= 101;
	String collegeName= "Sara Institute of Technology";
	float markScored= 92.14f;
	float cgpa= 8.2f;

	public static void main(String[] args) {
		
		Student stud= new Student();
		
		System.out.println("****Student Report***");
		System.out.println("\nStudent Name :"+stud.studentName+
				           "\nRoll Number  :"+stud.rollNo+
				           "\nCollege Nmae :"+stud.collegeName+
				           "\nMark Scored  :"+stud.markScored+
				           "\nCGPA         :"+stud.cgpa);

	}

}
