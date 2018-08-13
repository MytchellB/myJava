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
	
	
	
}
