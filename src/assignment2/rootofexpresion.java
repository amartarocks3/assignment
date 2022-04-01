package assignment2;

import java.util.Scanner;
import java.lang.Math;
public class rootofexpresion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double root1;
		double root2;
		int delta = (b*b)-4*a*c;		
		root1 = (-b+(Math.sqrt(delta))/(2*a));
		root2 = (-b-(Math.sqrt(delta))/(2*a));
		System.out.println("root1 = " + root1);
		System.out.println("root2 = " + root2);
		
	}
}
