package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {

	// UC1 - Calculate length
	public static void calculateLength() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X1 value: ");
		int x1 = sc.nextInt();
		System.out.println("Enter Y1 value: ");
		int y1 = sc.nextInt();
		System.out.println("Enter X2 value: ");
		int x2 = sc.nextInt();
		System.out.println("Enter Y2 value: ");
		int y2 = sc.nextInt();
		
		double a = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
		System.out.println("Length of the line = " + a);
	}

	public static void main(String[] args) {
		System.out.println("<---------Welcome to Line Comparison------------->");
		calculateLength();
	}

}
