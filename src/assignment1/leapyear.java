package assignment1;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%100!=0 && year%400!=0) {
			if(year%4==0) {
				System.out.println("The year is a leap year");
			}
			else
			{
				System.out.println("The year is not leap year");
			}
		}
		else
		{
			System.out.println("The year is not leap year");
		}

	}

}
