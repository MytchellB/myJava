package myJava;

public class myJavaClass {
	int bunnyEarsTotal = 0;
	
	public int countBunnyEars(int numBunnyEars){
		if ( numBunnyEars == 0 ) {
			return bunnyEarsTotal;
		}
		else if (numBunnyEars % 2 == 1){
			bunnyEarsTotal = bunnyEarsTotal + 2;
			return countBunnyEars(numBunnyEars - 1);
		}
		else {
			bunnyEarsTotal = bunnyEarsTotal + 3;
			return countBunnyEars(numBunnyEars - 1);
		}	
	}
	
}