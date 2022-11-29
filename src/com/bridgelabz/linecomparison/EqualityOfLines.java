package com.bridgelabz.linecomparison;

/*
 * UC - 2 - As a fan of geometry, I want to check equality of two lines based on the end points, So
that I know when two lines are the equal. - Using Java equals method to check equality of 2 Lengths is
preferable.
 */
import java.util.Scanner;

public class EqualityOfLines {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program.");
		Scanner scanner = new Scanner(System.in); // scanner class to take a input from user

		// initialize variables
		double x1, x2, y1, y2, x3, y3, x4, y4 = 0;
		int firstLine, secondLine = 0;

		// enter the x1 & y1 values of first point
		System.out.println("Enter x1 & y1 values of First point");
		x1 = scanner.nextDouble();
		y1 = scanner.nextDouble();

		// enter x2 & y2 values of Second point
		System.out.println("Enter x2 & y2 values of Second point");
		x2 = scanner.nextDouble();
		y2 = scanner.nextDouble();

		// calculate the length of first line
		firstLine = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
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
		secondLine = (int) Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println("Length of Second line = " + secondLine);

		// convert the length of line into string
		String firstString = Double.toString(firstLine);
		String secondString = Double.toString(secondLine);

		// compare the length of two line using equals Method
		if (firstString.equals(secondString) == true) {

			System.out.println("Both lines are equal");
		} else {

			System.out.println("Both lines are not equal");
		}

		scanner.close();

	}

}
