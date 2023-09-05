package com.hcl.assignment1;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Reverse String
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		Assignment obj = new Assignment();
		System.out.println(obj.reverseString(str));

		// Odd Number Exception
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		obj.oddException(num);

		// Factorial of a Number
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		System.out.println("The Factorial of a number "+ number +" is "+obj.numFact(number));

		// student grades using switch case
		obj.studentGrades1();

		// student grades using if else condition
		obj.studentGrades2();
	}

	// Reverse String implementation
	public String reverseString(String str) {
		char ch;
		String newstr = "";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			newstr = ch + newstr;
		}
		return newstr;
//		StringBuilder rev = new StringBuilder(str);
//		System.out.println(rev.reverse());
	
	}

	// Odd Number Exception Implementation
	public void oddException(int num) {

		if (num % 2 != 0) {
			try {
				throw new oddFoundException();

			} catch (oddFoundException e) {
				System.err.println("Its an odd number!!");
			}
		}
	}

	// Factorial of a Number Implementation
	public int numFact(int num) {
		int fact = 1;
		while (num != 0) {
			fact = fact * num;
			num--;
		}
		return fact;
	}

	// student grades using switch case Implementation
	public void studentGrades1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Students Grade!!");
		System.out.println(" Grade A ");
		System.out.println(" Grade B ");
		System.out.println(" Grade C ");
		System.out.println(" Grade D ");
		System.out.println(" Grade F ");
		System.out.println("Enter the Grade");
		String choice = sc.next();
		switch (choice) {
		case "A":
			System.out.println("Excellent!");
			break;
		case "B":
			System.out.println("Good Job!");
			break;
		case "C":
			System.out.println("Average Job!");
			break;
		case "D":
			System.out.println("Needs Improvement");
			break;
		case "F":
			System.out.println("Failed");
			break;
		default:
			System.out.println("Invalid Grades");
			break;
		}

	}

	// student grades using if else condition Implementation
	public void studentGrades2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Students Grade!!");
		System.out.println(" Grade A ");
		System.out.println(" Grade B ");
		System.out.println(" Grade C ");
		System.out.println(" Grade D ");
		System.out.println(" Grade F ");
		System.out.println("Enter the Grade");
		String choice = sc.next();
		if (choice.equals("A")) {
			System.out.println("Excellent!");
		} else if (choice.equals("B")) {
			System.out.println("Good Job!");
		} else if (choice.equals("C")) {
			System.out.println("Average Job!");
		} else if (choice.equals("D")) {
			System.out.println("Needs Improvement");
		} else if (choice.equals("F")) {
			System.out.println("Failed");
		} else {
			System.out.println("Invalid Grades");
		}
	}

}
