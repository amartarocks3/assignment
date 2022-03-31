package assignment2;

import java.util.Scanner;

public class checkdaymonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		int d = sc.nextInt();
		System.out.println("Enter month");
		int m = sc.nextInt();
		if(m>=3 && m<=6) {
			if(m==3 && d>=20 && d<=30) {
				System.out.println("True");
			}
			else if(m==6 && d<=20 && d>=1) {
				System.out.println("True");
			}
			else if(m>3 && m<6 && d>=1 && d<=30) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
			
		}
	}

}
