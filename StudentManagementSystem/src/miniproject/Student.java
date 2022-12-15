package miniproject;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 1600;
	private static int id = 106;
	
	
 public Student() {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
	}
	
	public void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	public void enroll() {
		do {
			System.out.println("Enter course to enroll (F to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("F")) {
				courses = courses + "\n   " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		}	while (1 !=0);
	}
	
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" +payment);
		viewBalance();
	}
	
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
	}

}
