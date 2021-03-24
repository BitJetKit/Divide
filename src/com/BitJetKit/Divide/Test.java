package com.BitJetKit.Divide;

import java.util.Scanner;
/*
 * Title: Divide
 * @author: BitJetKit
 * Date: March 24, 2021
 * Purpose: Test the Divide class.
 */
public class Test {

	public static void main(String[] args) {
		double userNumber;
		Divide divider = new Divide();
		Scanner reader = new Scanner(System.in);
		
		System.out.println("===============Add===============");
		System.out.println("Enter 2 numbers from " + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ".");
		
		System.out.println("\nEnter the 1st number: ");
		userNumber = reader.nextDouble();
		divider.setNumber1(userNumber);
		
		System.out.println("\nEnter the 2nd number: ");
		userNumber = reader.nextDouble();
		divider.setNumber2(userNumber);
		divider.setQuotient(divider.getNumber1(), divider.getNumber2());
		divider.printQuotient();
	}
}