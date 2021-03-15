//Beseyata DeShmaya
package model;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getMultiplesOf3(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int expectedSize = 0;
		
		for(Integer num : numbers) {
			if(num%3==0)
				expectedSize++;
		}
		result = new int[expectedSize];

		int resultIndex = 0;
		
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i]%3==0) {
				result[resultIndex] = numbers[i];
				resultIndex++;
				
			}
		}
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}	
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		int expectedSize = 0;
		
		for(Integer num : numbers) {
			if(num!=n)
				expectedSize++;
		}
		result = new int[expectedSize];
		
		int resultIndex = 0;
		
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i]!=n) {
				result[resultIndex] = numbers[i];
				resultIndex++;
				
			}
		}
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		result = new String[numbers.length];
		
		for(int i = 0;i<numbers.length;i++) {
			String prefix = "["+numbers[0];
			for(int j = 1;j<=i;j++) {
				prefix+=", "+numbers[j];
			}
			result[i] = prefix+"]";
		}
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		result = new int[numbers.length];
		int resultIndex = 0;
		
		for(int remainder = 0;remainder<3;remainder++) {
			
			for(int i = 0;i<numbers.length;i++) {
				if(numbers[i]%3==remainder) {
					result[resultIndex] = numbers[i];
					resultIndex++;
				}
			}
		}
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}
}
