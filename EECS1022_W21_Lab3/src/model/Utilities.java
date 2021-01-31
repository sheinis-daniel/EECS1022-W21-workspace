//Beseyata Deshmaya
package model;

public class Utilities {
	/*
	 * Input parameters: - `lower` is the lower bound - `upper` is the upper bound
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly
	 * forbidden. Violation of this will result in a 50% penalty on your marks. Try
	 * to solve this problem using loops only.
	 * 
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getNumbers(int lower, int upper) {
		String result = "";

		/*
		 * Your implementation of this method starts here. Recall from Week 1's tutorial
		 * videos: 1. No System.out.println statements should appear here. Instead, an
		 * explicit, final `return` statement is placed for you. 2. No Scanner
		 * operations should appear here (e.g., input.nextInt()). Instead, refer to the
		 * input parameters of this method.
		 */
		if (lower < 0 || upper < 0) {
			result = "Error: both bounds must be non-negative";
		} else if (lower > upper) {
			result = "Error: lower bound " + lower + " is not less than or equal to upper bound " + upper;
		} else {
			int numOfNums = upper - lower + 1;
			result += numOfNums + " number" + (numOfNums == 1 ? "" : "s") + " between " + lower + " and " + upper + ": <";
			for (int i = lower; i <= upper; i++) {
				if (i % 3 == 0) {
					result += "(" + i + ")";
				} else if (i % 3 == 1) {
					result += "[" + i + "]";
				} else {
					result += "{" + i + "}";
				}
				if (i != upper) {
					result += ", ";
				}
			}
			result += ">";
		}

		/* Your implementation ends here. */

		return result;
	}

	/*
	 * Input parameters: - `ft`, `d`, `n` are the first term, common difference, and
	 * size of an arithmetic sequence.
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly
	 * forbidden. Violation of this will result in a 50% penalty on your marks. Try
	 * to solve this problem using loops only.
	 * 
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "";

		/*
		 * Your implementation of this method starts here. Recall from Week 1's tutorial
		 * videos: 1. No System.out.println statements should appear here. Instead, an
		 * explicit, final `return` statement is placed for you. 2. No Scanner
		 * operations should appear here (e.g., input.nextInt()). Instead, refer to the
		 * input parameters of this method.
		 */
		result+="{";
		int sum = ft;
		double average = ft;
		String sequence = ft+"";
		for(int i = 0;i<n;i++) {
			result += "[sum of <"+sequence+">: "+sum+" ; avg of <"+sequence+">: "+String.format("%.2f",average)+"]";
			if(i<n-1) 
				result+=", ";
			ft+=d;
			sequence+=", " + ft;
			sum+=ft;
			average= (average*(i+1.0)+ft)/(i+2.0);
			
		}
		
		result+="}";
		
		

		/* Your implementation ends here. */
		return result;
	}

	/*
	 * Input parameters: - `ft1`, `d1`, `n1` are the first term, common difference,
	 * and size of the first arithmetic sequence. - `ft2`, `d2`, `n2` are the second
	 * term, common difference, and size of the second arithmetic sequence.
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly
	 * forbidden. Violation of this will result in a 50% penalty on your marks. Try
	 * to solve this problem using loops only.
	 * 
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";

		/*
		 * Your implementation of this method starts here. Recall from Week 1's tutorial
		 * videos: 1. No System.out.println statements should appear here. Instead, an
		 * explicit, final `return` statement is placed for you. 2. No Scanner
		 * operations should appear here (e.g., input.nextInt()). Instead, refer to the
		 * input parameters of this method.
		 */
		result+="<";
		int counted1 = 0;
		int counted2 = 0;
		for(int i = 0;i<n1+n2;i++) {
			if(counted2==n2||(i%2==0&&counted1<n1)) {
				result+="("+ft1+")";
				ft1+=d1;
				counted1++;
			} else {
				result+="["+ft2+"]";
				ft2+=d2;
				counted2++;
			}
			if(i<n1+n2-1) 
				result+=", ";
		}
		result+=">";
		
		

		/* Your implementation ends here. */
		return result;
	}
}
