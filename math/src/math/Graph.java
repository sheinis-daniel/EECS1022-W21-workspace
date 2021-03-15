package math;

public class Graph {
	public static void main (String args[]) {
		for(int i = 1;i<=10;i++) {
			System.out.println("first at "+i+" "+(2*Math.pow(Math.E, 0.01*i)));
			System.out.println("second at "+i+" "+(Math.sqrt(-1/((0.01*i-1.0/12)*(3)))));
		}
	}

}
