package myJava;

import java.util.Scanner;
import java.math.*;

public class compoundInterest {
	
	
		public static void calculateCompoundInterest() {
			Scanner keyboard = new Scanner(System.in);
			
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
			keyboard.close();
		}
		
		public static void main(String[] args) {
			
			calculateCompoundInterest();
			
		}

}
