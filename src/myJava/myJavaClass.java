package myJava;

import java.util.HashMap;
import java.util.Map;

public class myJavaClass {
	int bunnyEarsTotal = 0;
	int occurrencesof7Total = 0;
	
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
	
	public int countOccurrencesof7(int myInteger) {
		String intLength = Integer.toString(myInteger);
		if ( intLength.length() == 1 ) {
			if ( myInteger == 7) {
				occurrencesof7Total++;
				return occurrencesof7Total;
			}
			else {
				return occurrencesof7Total;
			}
		}
		else {
			if ( myInteger % 10 == 7 ) {
				occurrencesof7Total++;
				return countOccurrencesof7(myInteger / 10);
			}
			else  {
				return countOccurrencesof7(myInteger / 10);
			}
		}
	}
	
	public String replacePi(String myString) {
		if ( !myString.contains("pi")) {
			return myString;
		}
		else {
			myString = myString.replace("pi", "3.14");
			return myString;
		}
	}
	
	public boolean mapTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("es", "Spain");
		System.out.println(map.get("es"));
		System.out.println(map.get("us"));
		return true;
	}
	
}