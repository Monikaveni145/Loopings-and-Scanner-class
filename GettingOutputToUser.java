package tamilnadu.Looping;

import java.util.Scanner;

public class GettingOutputToUser {
	public static void main(String[] args) {
		GettingOutputToUser out = new GettingOutputToUser();
		out.exampleint();
		out.examplefloat();
		out.examplestring();
	}

	public void exampleint() {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int sub = 3;
		while (sub > 0) {
			System.out.println("Enter Mark = ");
			int m1 = sc.nextInt();
			total = total + m1;
			sub--;
		}
		System.out.println("Total Marks = " + total);
	}

	public void examplefloat() {
		Scanner sc = new Scanner(System.in);
		int person = 3;
		String name = " ";
		float hight = 6.5f;

		while (person > 0) {
			System.out.println("Enter your name ");
			String name1 = sc.next();
			name = name1;
			System.out.println("Enter hight = ");
			float no = sc.nextFloat();
			hight = no;
			person--;
			if (hight >= 6.5f) {
				System.out.println("you are eligible");
			} else {
				System.out.println("you are not eligible");
			}
		}
	}

	public void examplestring() {
		Scanner el = new Scanner(System.in);
		int person = 3;
		String name = " ";
		int marks;
		while (person > 0) {
			System.out.println("Enter your name ");
			String name1 = el.next();
			name = name1;
			System.out.println("Enter mark = ");
			int mark = el.nextInt();
			marks = mark;
			person--;
			if (mark >= 85) {
				System.out.println("Welcome Ms/Mr. " + name + " to java class.");
			} else {
				System.out.println("sry Mr/Ms." + name + " u r not eligible.");
			}
		}
	}
}
