package myJava;

public class myJavaClass {
	int bunnyEarsTotal = 0;
	public int countBunnyEars(int numBunnyEars){
		if ( numBunnyEars == 0 ) {
			System.out.println("0 Bunny Ears");
			return bunnyEarsTotal;
		}
		else if (numBunnyEars % 2 == 1){
			System.out.println("Odd #");
			bunnyEarsTotal = bunnyEarsTotal + 2;
			return countBunnyEars(numBunnyEars - 1);
		}
		else {
			System.out.println("Even #");
			bunnyEarsTotal = bunnyEarsTotal + 3;
			return countBunnyEars(numBunnyEars - 1);
		}	
	}
	
}