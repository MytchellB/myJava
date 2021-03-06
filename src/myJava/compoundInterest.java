package myJava;

import java.util.Scanner;

public class compoundInterest {
	static Scanner keyboard = new Scanner(System.in);
	
		public static void calculateCompoundInterest() {
			System.out.println("Enter principal amount: ");
			double principal = keyboard.nextInt();
			
			System.out.println("Enter interest rate: ");
			double interest = keyboard.nextDouble() * .01;
			
			System.out.println("Enter number of years: ");
			double years = keyboard.nextDouble();
			
			for ( int i = 1; i <= years; i++ ) {
				double amount = principal * Math.pow(1 + (interest / 12), 12 * i);
				System.out.println( (double) Math.round(amount * 100) / 100);
			}
		}
		
		public static double calculateAreaOfTriangle(double base, double height) {
			return .5 * base * height;
		}
		
		public static double calculateAreaOfPentagon(double pentagonSide) {
			return .25 * Math.sqrt( 5 *(5+2 * Math.sqrt(5))) * Math.pow(pentagonSide, 2);
		}	
}