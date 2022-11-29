package com.bridgelabz.linecomparison;

/*
 *UC - 1 - As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates
using the Cartesian system, So that I can calculate its length. - A Length as 2 Points (x1, y1) and (x2, y2) - 
Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
 */
import java.util.Scanner;

public class LengthOfLine {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparison Computation Program.");
		Scanner scanner = new Scanner(System.in);			//scanner class to take a input from user
		 //initialize variables
		double x1, x2, y1, y2 = 0;						  
		int lengthOfLine = 0;
		
		// enter the x1 & y1 values of first point
		System.out.println("Enter x1 & y1 values of First point");		
		x1 = scanner.nextDouble();							
		y1 = scanner.nextDouble();

		// Enter x2 & y2 values of Second point
		System.out.println("Enter x2 & y2 values of Second point");
		x2 = scanner.nextDouble();							
		y2 = scanner.nextDouble();

		//calculate the length of line
		lengthOfLine=(int)Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of a Line = " + lengthOfLine);

		scanner.close();
	}

}
