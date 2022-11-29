package com.bridgelabz.linecomparison;
/*
 *  UC - 3 - As a fan of geometry, I want to compare two lines based on the end points, So that I know
one line is equal, greater or less than the other line.Using Java compareTo method to compare 2 Lengths is
preferable.
 */
import java.util.Scanner;

public class CompareLines {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program.");
		Scanner scanner = new Scanner(System.in);			// scanner class to take a input from user

		// initialize variables
		double x1, x2, y1, y2, x3, y3, x4, y4;
		int firstLine, secondLine;
		
		// enter the x1 & y1 values of first point
		System.out.println("Enter x1 & y1 values of First point");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();
		
		// enter x2 & y2 values of Second point
		System.out.println("Enter x2 & y2 values of Second point");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();

		// calculate the length of first line
		firstLine = (int) Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);
		System.out.println("Length of First line = " + firstLine);

		// enter x3 & y3 values of third point
		System.out.println("Enter x3 & y3 values of Third point");
		x3 = scanner.nextDouble();
		y3 = scanner.nextDouble();
		
		// enter x4 & y4 values of fourth point
		System.out.println("Enter x4 & y4 values of Fourth point");
		x4 = scanner.nextDouble();
		y4 = scanner.nextDouble();
		
		// calculate the length of second line
		secondLine = (int) Math.sqrt((x4 - x3) * 2 + (y4 - y3) * 2);
		System.out.println("Length of Second line = " + secondLine);

		// convert the length of line into string
		String firstString = Double.toString(firstLine);
		String secondString = Double.toString(secondLine);

		//compare the length of two line using compareTo Method
		int check = firstString.compareTo(secondString);
		if (check == 0) {

			System.out.println("Both lines are equal");
		} else {

			System.out.println("Both lines are not equal");
		}
		scanner.close();

	}

}
