package com.bridgelabz.linecomparison;
/*
 * Use Java Object Oriented Programming Concepts of Line and Point as well as equals and
compareTo methods. - Using Java compareTo method to compare 2 Lengths is
 */
import java.util.Scanner;

public class LineComparison {
	// initialize variables
	static double x1, x2, y1, y2, x3, x4, y3, y4;
	static double firstLengthOfLine;
	static double secondLengthOfLine;
	static Scanner scanner = new Scanner(System.in);

	// Enter the values for first line
	public static void firstLine() {
		System.out.println("Enter co-ordinates for X axis for firstline");
		x1 = scanner.nextDouble();
		x2 = scanner.nextDouble();
		System.out.println("Enter co-ordinates for Y axis for firstline");
		y1 = scanner.nextDouble();
		y2 = scanner.nextDouble();
	}
	// Calculate the length of first line.
	public static void firstLengthOfLine() {
		firstLengthOfLine = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of a Line = " + firstLengthOfLine);
	}

	// Enter the values for Second line
	public static void secondLine() {
		System.out.println("Enter co-ordinates for X axis for secondline");
		x3 = scanner.nextDouble();
		x4 = scanner.nextDouble();
		System.out.println("Enter co-ordinates for Y axis for secondline");
		y3 = scanner.nextDouble();
		y4 = scanner.nextDouble();
	}

	// Calculate the length of second line.
	public static void secondLengthOfLine() {
		secondLengthOfLine = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("Length of a Line = " + secondLengthOfLine);
	}

	public static void compareLines() {
		String firstString = Double.toString(firstLengthOfLine);
		String secondString = Double.toString(secondLengthOfLine);
		// compare the length of two line using compareTo Method
		int check = firstString.compareTo(secondString);
		if (check == 0) {
			System.out.println("Both lines are equal");
		} else {
			System.out.println("Both lines are not equal");
		}
	}

	public static void checkEqualityOfLine() {
		String firstString = Double.toString(firstLengthOfLine);
		String secondString = Double.toString(secondLengthOfLine);
		// compare the length of two line using equals Method
		if (firstString.equals(secondString) == true) {
			System.out.println("Both lines are equal");
		} else {
			System.out.println("Both lines are not equal");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparison Computation Program: ");
		// calling methods
		firstLine();
		secondLine();
		firstLengthOfLine();
		secondLengthOfLine();
		compareLines();
	}

}
