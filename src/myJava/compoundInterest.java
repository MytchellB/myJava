package myJava;

import java.util.Scanner;
import java.math.*;

public class compoundInterest {
	
	
		public static void calculateCompoundInterest() {
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter principal amount: ");
			double principal = keyboard.nextInt();
			
			keyboard.nextLine();
			System.out.println("Enter interest rate: ");
			double interest = keyboard.nextDouble() * .01;
			
			double amount = principal * Math.pow(1 + (interest / 12), 12);
			
			System.out.println( (double) Math.round(amount * 100) / 100);
			
		}
		
		public static void main(String[] args) {
			
			calculateCompoundInterest();
		}

}
