package assignment2;

import java.util.Scanner;
import java.lang.Math;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int distance=0;
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		distance=(int) Math.sqrt(x*x+y*y);
		System.out.println(distance);
		
	}

}
