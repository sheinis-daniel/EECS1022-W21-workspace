//Beseyata DeShmaya
package math;

import java.util.Scanner;

public class Main {
	static final int SUPER_HIGH_NUMBER = 1000000000;
	
	public static void main(String args[]) {
		double bestAproximation = getTrapezoid(SUPER_HIGH_NUMBER);
		double []offsets = {0.0001, 0.00001, 0.0000001};
		int currentOffsetAttemptIndex = 0;
		
		//starting from 6 as all numbers up to 5 were shown not to be accurate enough already
		for(int i = 6;i<SUPER_HIGH_NUMBER;i++) {
			double area = getTrapezoid(i);
			double offset = Math.abs(bestAproximation);
		}

	}

	private static double getTrapezoid(int n) {
		double increment = 1.0 / n;
		double numerator = 0;
		for (int i = 0; i <= n; i++) {
			double number = Math.pow(Math.E, 1 / (1 + i * increment));
			if (i > 0 && i < n) {
				number *= 2;
			}
			numerator += number;
		}
		return numerator / (2 * n);
	}
}
