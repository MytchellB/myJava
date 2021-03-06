package myJava;

import java.util.HashMap;
import java.util.Map;

public class myJavaClass {
	int bunnyEarsTotal = 0;
	int occurrencesof7Total = 0;
	int groupSumCounter = 0;
	
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
	
	public int groupSum2(int start, int[] nums, int target) {
		if ( groupSumCounter == nums.length - 1 ) {
			if ( start == target ) {
				System.out.println("Correct Answer");
				return 1;
			}
			else {
				System.out.println("No Answer");
				return 0;
			}
		}
		else {
			
			return groupSum2(start, nums, target);
		}
	}
	
	public boolean groupSum(int start, int[] nums, int target)
	{
	  if(target == 0)
	  	return true;
	  if(start == nums.length)
	  	return false;
	  if(groupSum(start + 1, nums, target - nums[start]))
	  	return true;
	  return groupSum(start + 1, nums, target);
	}
	
	public boolean scoresIncreasing(int[] scores) {
		for ( int i = 0; i < scores.length - 1; i++) {
			if ( scores[i + 1] < scores[i]) {
				return false;
			}
		}
		return true; 
	}

	public int scoresAverage(int[] scores) {
		int leftSum = average(scores, 0, scores.length / 2 - 1); // Find average of first half of array.
		int rightSum = average(scores, scores.length / 2, scores.length - 1); // Find average of second half of array.
		if ( leftSum > rightSum ) {
			return leftSum;
		}
		else {
			return rightSum;
		}
	}

	public int average(int[] scores, int start, int end) {
		int totalNums = 0;
		int totalSum = 0;
		for ( int i = start; i <= end; i++) {
			totalSum += scores[i];
			totalNums++;
		}
		return totalSum / totalNums;
	}
	
	public int scoreUp(String[] key, String[] answers) {
		int totalScore = 0;
		for ( int i = 0; i < key.length; i++) {
			if ( key[i] == answers[i]) {
				totalScore += 4;
			}
			else {
				if ( answers[i] != "?" ) {
				totalScore -= 1;
				}
			}
		}
		  return totalScore;
	}
	
	public int sumHeights(int[] heights, int start, int end) {
		int difference = 0, differenceSum = 0;
		for ( int i = start; i < end; i++) {
			difference = Math.abs(heights[i] - heights[i+1]);
			differenceSum += difference;
		}
		return differenceSum;
	}

	
}