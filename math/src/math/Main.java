//Beseyata DeShmaya
package math;

import java.util.Scanner;

public class Main {
	private static final double H =1;
	private static final double XI =0;
	private static final double YI =1000;
	private static final double VALUE =50;
	
	
	public static void main(String args[]) {
		double x = XI;
		double y = YI;
		while(!(Math.abs(x-VALUE)<0.000001)) {
			double xNew = x+H;
			double yNew = y + H*function(x,y);
			
			System.out.println("x "+xNew);
			System.out.println("y "+yNew);
			x=xNew;
			y=yNew;
		}
	}
	
	private static double function(double x, double y) {
		return 0.0017*y*(1-y/6100);
	}
}
