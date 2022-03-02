package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1, num2 ;
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter first number:");
		
		num1 = scan.nextFloat();
		
		System.out.println("Enter the second number:");
		num2 = scan.nextFloat();
		
		System.out.print("Enter an operator (+,-,*,/) ");
		
		String operator = scan.next();
		
		scan.close();
		
		switch (operator) {
		
		case "+" : 
			System.out.println("The sum is: " + (num1+num2));
			break;
			
		case "-" : 
			System.out.println("The subtraction is: " + (num1-num2));
			break;
			
		case "*" : 
			System.out.println("The multiplied value is: " + (num1*num2));
			break;
			
		case "/" : 
			System.out.println("The divided value is: " + (num1/num2));
			break;
			
			default:
				System.out.println("Enter a valid operator");
				break;
		
		}
		

		

	}

}
