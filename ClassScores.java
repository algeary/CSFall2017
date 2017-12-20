public class ClassScores {
	 public int[] findModeSlow(int[] scores) {
		 
         // Step 1: find # occurrences of modal value(s)

		 int modeCount = 0;
		 for(int s = 0; s <= 100; s++) {
			 int count = getCount(scores,s);
			 if (count > modeCount) {
				 modeCount = count;
			 }
		 }
		 
		 // Step 2: count # modal values
		 int modeOccurrences = 0;
		 for(int s = 0; s <= 100; s++) {
			 int count = getCount(scores,s);
			 if (count == modeCount) {
				 modeOccurrences += 1;
			 }
		 }
		 
		 // Step 3: find modal values, in order, and store in array for return
		 int[] ret = new int[modeOccurrences];
		 int index = 0;
		 for(int s= 0; s <= 100; s++) {
			 int count = getCount(scores,s);
			 if (count == modeCount) {
				 ret[index] = s;
				 index += 1;
			 }
		 }
		 return ret;
     }

	 /**
	  * Return number of times val occurs in array
	  * @param scores is array of int values
	  * @param val is int value
	  * @return # times val occurs in scores
	  */
	private int getCount(int[] scores, int val) {
		int t = 0;
		for(int k=0; k < scores.length; k++) {
			if (scores[k] == val) {
				t += 1;
			}
		}
		return t;
	}
	
	public int[] findModeFast(int[] scores) {
		int[] counters = new int[101];
		int maxOccurrences = 0;
		int modeCount = 0;
		for(int value : scores) {
			counters[value] += 1;
			if (counters[value] > maxOccurrences) {
				maxOccurrences = counters[value];
				modeCount = 1;
			}
			else if (counters[value] == maxOccurrences) {
				modeCount += 1;
			}
		}
		
		int[] ret = new int[modeCount];
		int index = 0;
		for(int value=0; value <= 100; value += 1) {
			if (counters[value] == maxOccurrences) {
				ret[index] = value;
				index += 1;
			}
		}
		return ret;
	}
	
	public int[] findMode(int[] scores) {
		return findModeFast(scores);
	}
}
