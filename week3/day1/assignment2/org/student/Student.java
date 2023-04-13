package week3.day1.assignment2.org.student;

import week3.day1.assignment2.org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Student Name : John");
	}
	public void studentDept() {
		System.out.println("Student Department : Information Technology");
	}
	public void studentId() {
		System.out.println("Student ID : IT0011");
	}
	
	public static void main(String[] args) {
		
		Student stud= new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}
}
