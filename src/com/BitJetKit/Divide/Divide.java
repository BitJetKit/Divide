package com.BitJetKit.Divide;

public class Divide {
	private double number1;
	private double number2;
	private double quotient;
	
	public double getNumber1() {
		return number1;
	}
	public void setNumber1(double number1) {
		this.number1 = number1;
	}
	public double getNumber2() {
		return number2;
	}
	public void setNumber2(double number2) {
		this.number2 = number2;
	}
	public void setQuotient(double number1, double number2) {
		quotient = number1 - number2;
	}
	public void printQuotient() {
		System.out.println("1st number = " + number1 + " 2nd number = " + number2 + " Quotient = " + quotient);
	}	
	
}
