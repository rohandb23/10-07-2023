package com.aurionpro.test;
import com.aurionpro.model.Student;
public class StudentTest {
	public static void main(String[] args) {
		Student obj = new Student();
		obj.id = 10;
		obj.name = "Rohan";
		obj.emailId = "rohandbhise@gmail.com";
		System.out.println("student id: "+obj.id);
		System.out.println("student name: "+obj.name);
		System.out.println("student email: "+obj.emailId);
	}
}
