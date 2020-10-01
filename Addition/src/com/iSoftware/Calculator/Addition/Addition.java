package com.iSoftware.Calculator.Addition;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
	/* Added try and catch, so even if user enters for example, 92 and then Hello, error won't come. 
	Instead, "Enter a number, not a letter/word" will be displayed in the command line */
		try{	
		// Scanner to read user input from command line
		Scanner readNumber = new Scanner(System.in);
		System.out.println("Enter Two Numbers and press Enter after each input:):");
		// two variables to hold numbers and third to store the calculated value
		double add1, add2, add3;
		System.out.println("Enter the First Number:");
		add1 = readNumber.nextDouble();
		System.out.println("Enter the Second Number:");
		add2 = readNumber.nextDouble();
		// Arithmetic Operation
		add3 = add1 + add2;
		System.out.println("Sum = " + add3);
		}
		catch(Exception word){
			System.out.println("Enter a number, not letter/word");
		}
	}
}
