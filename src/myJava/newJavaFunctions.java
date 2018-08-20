package myJava;

public class newJavaFunctions {

	public boolean scores100(int[] scores) { //checks if 100 is next to another 100 in an array.
		boolean isCurrent100 = false, isNext100 = false;
		for ( int i = 0; i < scores.length - 1; i++ ) {
			isCurrent100 = false;
			isNext100 = false;
			if ( scores[i] == 100) {
				isCurrent100 = true;
			}
			if ( scores[i+1] == 100) {
				isNext100 = true;
			}
			if ( isCurrent100 && isNext100) { 
				return true;
			}
		}
		return false;
	}
	
	public String[] mergeTwo(String[] a, String[] b, int n) {
		String c[] = new String[n];
		int aCounter = 0, bCounter = 0;
		String currentAChar, currentBChar;
		char aChar, bChar;
		for ( int i = 0; i < n; i++ ) {
			currentAChar = a[aCounter];
			currentBChar = b[bCounter];
			aChar = currentAChar.charAt(0);
			bChar = currentBChar.charAt(0);
			if ( aChar > bChar) {
				c[i] = currentAChar;
				aCounter++;
			}
			else {
				c[i] = currentBChar;
				bCounter++;
			}
			System.out.println(c[i]);
		}
		
		return c;
	}
	
	public boolean makeBricks(int small, int big, int goal) { // 3 1 8
		int numBigLeft = big;
		int numSmallLeft = small;
		
		while ( goal >= 5 && numBigLeft >= 1 ) {
			goal -= 5;
			numBigLeft--;
		}
		while ( goal >= 1 && numSmallLeft >= 1 ) {
			goal -= 1;
			numSmallLeft--;
		}
		if ( goal == 0 ) {
			return true;
		}
		return false;
	}
	
	public int makeChocolate(int small, int big, int goal) {
		while ( goal >= 5 && big != 0 ) {
			goal -= 5;
			big--;
		}
		if ( goal % 5 == small) {
			return small;
		}
		else if ( goal == 0 ) {
			return 0;
		}
		else if ( small >= goal ) {
			return goal;
		}
		return -1;	
	}
	
	public String stringTimes(String str, int n) {
		String newString = "";
		for ( int i = 0; i < n; i++ ) {
			newString += str;
		}
		return newString;
	}
	
	public int last2(String str) {
		String last2Chars = str.substring(str.length() - 2, str.length()), tempStr = "";
		int last2CharsCount = 0;
		for ( int i = 0; i < str.length() - 3; i++ ) {
			tempStr = "";
			tempStr += str.charAt(i);
			tempStr += str.charAt(i + 1);
			if ( tempStr.equals(last2Chars)) {
				last2CharsCount++;
			}
		}
		return last2CharsCount;
	}

	public boolean array123(int[] nums) {
		
		
		return true;
	}
	
}
