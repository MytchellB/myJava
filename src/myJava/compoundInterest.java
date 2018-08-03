package myJava;

import java.util.Scanner;
import java.math.*;

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
		
		public static String checkValidPassword(String myPassword) {
			if(myPassword.length() > 9) {
//				String.split(myPassword);
//				if()
				return(myPassword);
			}
			return(myPassword);
		}
		
		public static void main(String[] args) {
//			calculateCompoundInterest();
			
			System.out.println("Enter password:");
			System.out.println(checkValidPassword(keyboard.nextLine()));	
		}	
}