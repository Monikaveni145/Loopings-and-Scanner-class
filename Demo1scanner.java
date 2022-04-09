package tamilnadu.Looping;

import java.util.Scanner;

public class Demo1scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st;
		char gen;
		int ag;
		long mobile;
		double gpa;
		boolean std;
		byte ppr;
		float ht;
		short yr;
		String dept;

		System.out.println("enter name");
		String name = sc.nextLine();
		st = name;
		System.out.println("Enter gender");
		char gender = sc.next().charAt(0);
		gen = gender;
		System.out.println("Age");
		int age = sc.nextInt();
		ag = age;
		System.out.println("Mobile no ");
		long mobileNo = sc.nextLong();
		mobile = mobileNo;
		System.out.println("Enter cgpa ");
		double cgpa = sc.nextDouble();
		gpa = cgpa;
		System.out.println("Clg student");
		boolean student = sc.nextBoolean();
		std = student;
		System.out.println("Total papers");
		byte papers = sc.nextByte();
		ppr = papers;
		System.out.println("Enter your hight");
		float hight = sc.nextFloat();
		ht = hight;
		System.out.println("Enter your year");
		short year = sc.nextShort();
		yr = year;
		System.out.println("Enter your Department");
		String department = sc.next();
		dept = department;

		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);
		System.out.println("CGPA: " + cgpa);
		System.out.println("student: " + student);
		System.out.println("subjects: " + papers);
		System.out.println("Hight: " + hight);
		System.out.println("Year: " + year);
		System.out.println("Department: " + department);

	}
}
