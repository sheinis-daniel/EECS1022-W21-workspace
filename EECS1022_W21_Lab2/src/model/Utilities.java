//Beseyata Deshmaya
package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 *  
	 * Refer to you lab instructions for what the method should return.
	 * 
	 * See this short tutorial video illustrating how to compute tax:
	 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";

		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		double tax = 0;
		double firstCutOff = (status==1) ? 8350 : 16700;
		double secondCutOff = (status == 1) ? 33950 : 67900;
		String case1 = (status == 1) ? "835.00" : "1670.00";
		String case2 = (status == 1) ? "3840.00" : "7680.00";
		
		String statusString = (status == 1) ? "Single" : "Married";
		if(status !=1&&status!=2) {
			result = "Illegal Status: "+status;
		}else if(income < firstCutOff) {
			tax=income*0.1;
			String taxString = String.format("%.2f", tax);
			result = statusString + " Filing: $"+taxString+" (Part I: $"+taxString+")";
		} else if(income<secondCutOff) {
			double finalTax = (income-firstCutOff)*0.15;
			tax = Double.parseDouble(case1)+finalTax;
			String taxString = String.format("%.2f", tax);
			String finalTaxString = String.format("%.2f", finalTax);
			result = statusString + " Filing: $"+taxString+" (Part I: $"+case1+", Part II: $"+finalTaxString+")";
			
		} else {
			double finalTax = (income-secondCutOff)*0.25;
			tax = Double.parseDouble(case1)+Double.parseDouble(case2)+finalTax;
			String taxString = String.format("%.2f", tax);
			String finalTaxString = String.format("%.2f", finalTax);
			result = statusString + " Filing: $"+taxString+" (Part I: $"+case1+", Part II: $"+case2+", Part III: $"+finalTaxString+")";
			
		}

		/* Your implementation ends here. */

		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 *     
	 * Hints:
	 *  - Compare character values using the relational operator ==.
	 *  - Study the 9 test cases in TestUtilites: they are arranged in a systematic (yet not exhaustive) way.
	 *    Q. In order to exhaustively test this game, considering how two players may play in two rounds,
	 *    	 how many tests do we need? (Optionally, you may write extra test yourself as an exercise.)
	 *    
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int player1Wins = 0;
		int player2Wins = 0;
		String firstRoundWinnerText ="";
		String secondRoundWinnerText ="";
		String firstOutputChar1 = "";
		String secondOutputChar1 = "";
		String firstOutputChar2 = "";
		String secondOutputChar2 = "";
		
		if(p1r1 =='S' && p2r1 == 'P') {
			player1Wins++;
			firstRoundWinnerText = p1 +" wins";
			firstOutputChar1 = p1r1+"";
			secondOutputChar1 = p2r1+"";
			
		} else if (p1r1 == 'P' && p2r1 == 'S') {
			player2Wins++;
			firstRoundWinnerText = p2 +" wins";
			firstOutputChar1 = p2r1+"";
			secondOutputChar1 = p1r1+"";
		} else if(p1r1 == p2r1) {
			firstRoundWinnerText="Tie";
			firstOutputChar1 = p1r1+"";
			secondOutputChar1 = p2r1+"";
		} else if (p1r1<p2r1) {
			player1Wins++;
			firstRoundWinnerText = p1 +" wins";
			firstOutputChar1 = p1r1+"";
			secondOutputChar1 = p2r1+"";
		} else {
			player2Wins++;
			firstRoundWinnerText = p2 +" wins";
			firstOutputChar1 = p2r1+"";
			secondOutputChar1 = p1r1+"";
		}
		
		if(p1r2 =='S' && p2r2 == 'P') {
			firstOutputChar2 = p1r2+"";
			secondOutputChar2 = p2r2+"";
			player1Wins++;
			secondRoundWinnerText = p1 +" wins";
		} else if (p1r2 == 'P' && p2r2 == 'S') {
			firstOutputChar2 = p2r2+"";
			secondOutputChar2 = p1r2+"";
			player2Wins++;
			secondRoundWinnerText = p2 +" wins";
		} else if(p1r2 == p2r2) {
			firstOutputChar2 = p1r2+"";
			secondOutputChar2 = p2r2+"";
			secondRoundWinnerText="Tie";
		} else if (p1r2<p2r2) {
			firstOutputChar2 = p1r2+"";
			secondOutputChar2 = p2r2+"";
			player1Wins++;
			secondRoundWinnerText = p1 +" wins";
		} else {
			firstOutputChar2 = p2r2+"";
			secondOutputChar2 = p1r2+"";
			player2Wins++;
			secondRoundWinnerText = p2 +" wins";
		}
		
		String winner = (player1Wins==player2Wins) ? "Tie" : (player1Wins>player2Wins) ? p1+" wins" : p2+" wins";
		
		result = "Game over: "+winner+"! [Round 1: ";
		result += firstRoundWinnerText + " ("+firstOutputChar1+" vs. "+secondOutputChar1+") ; ";
		result += "Round 2: "+secondRoundWinnerText+" ("+firstOutputChar2+" vs. "+secondOutputChar2+")]";
		
		/* Your implementation ends here. */

		return result;
	}
}
