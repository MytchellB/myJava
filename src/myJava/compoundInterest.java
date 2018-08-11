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
		
		public static double calculateAreaOfTriangle(double base, double height) {
			return .5 * base * height;
		}
		
		public static double calculateAreaOfPentagon(double pentagonSide) {
			return .25 * Math.sqrt( 5 *(5+2 * Math.sqrt(5))) * Math.pow(pentagonSide, 2);
		}
		
		public static void main(String[] args) {
			myJavaClass class1 = new myJavaClass();
			
//			calculateCompoundInterest();
			
//			System.out.println("Enter base of triangle then height:");
//			System.out.println("Area of Triangle is: " + calculateAreaOfTriangle(keyboard.nextDouble(), keyboard.nextDouble()));
			
//			System.out.println("Enter one side of pentagon:");
//			System.out.println("Area of Pentagon is: " + calculateAreaOfPentagon(keyboard.nextDouble()));
			
//			System.out.println("Enter number of Bunnies:");
//			System.out.println("There are " + class1.countBunnyEars(keyboard.nextInt()) + " Bunny Ears!");
//			class1.bunnyEarsTotal = 0;
//			System.out.println("There are " + class1.countBunnyEars(keyboard.nextInt()) + " Bunny Ears!");
//			class1.bunnyEarsTotal = 0;
			
//			System.out.println("Enter non-negative integer to count occurrences of digit 7:");
//			System.out.println("There are " + class1.countOccurrencesof7(keyboard.nextInt()) + " number sevens!");
			
//			System.out.println("Enter String (will replace occurrences of pi with 3.14):");
//			System.out.println(class1.replacePi(keyboard.nextLine()));
			
//			System.out.println(class1.mapTest());
			
			int start = 0;
			int nums[] = new int[] {1, 1, 1, 2, 1};
//			for ( int i = 0; i < 10; i++) {
//				nums[i] = i++;
//			}
			int target = 10;
//			System.out.println(class1.groupSum(start, nums, target));
			
//			int small = 3, big = 1, goal = 8;
//			System.out.println(class1.makeBricks(small, big, goal));
			
//			int nums2[] = new int[] {1, 1, 4};
//			System.out.println(class1.scoresIncreasing(nums2));
			
//			int nums3[] = new int[] {3, 4, 5, 1, 2, 3};
//			System.out.println(class1.scoresAverage(nums3));
			
			String key[] = new String[] {"a", "a", "b", "b"};
			String answers[] = new String[] {"a", "a", "b", "b"};
			
			System.out.println(class1.scoreUp(key, answers));
		}	
}