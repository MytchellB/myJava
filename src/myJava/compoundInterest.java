package myJava;

import java.util.Scanner;
import java.math.*;

public class compoundInterest {
	
	
		public static void calculateCompoundInterest() {
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter principal amount: ");
			int principal = keyboard.nextInt();
			
			System.out.println("Enter interest ratet: ");
			double interest = (keyboard.nextDouble()) * .01;
			
			double amount = principal * Math.pow((1 + (interest / 12)), 1);
			
			System.out.println(amount + '\n');
			
		}
		
		public static void main(String[] args) {
			
		
			calculateCompoundInterest();
		}

}
