package assignment2;

import java.util.Scanner;

public class operator1 {
	public static void main(String[] args) {
		int sum1=0,sum2=0,sum3=0,sum4=0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sum1=a+b*c;
		sum2=c+a/b;
		sum3=(a%b)+c;
		sum4=a*b+c;
		if(sum1>sum2 && sum1>sum3 && sum1>sum4) {
			System.out.println("sum1 is max " + sum1);
		}
		else if(sum2>sum1 && sum2>sum3 && sum2>sum4) {
			System.out.println("sum2 is max " + sum2);
		}
		else if(sum3>sum1 && sum3>sum2 && sum3>sum4) {
			System.out.println("sum3 is max " + sum3);
		}
		else {
			System.out.println("sum4 is max " + sum4);
		}
		
		if(sum1<sum2 && sum1<sum3 && sum1<sum4) {
			System.out.println("sum1 is min " + sum1);
		}
		else if(sum2<sum1 && sum2<sum3 && sum2<sum4) {
			System.out.println("sum2 is min " + sum2);
		}
		else if(sum3<sum1 && sum3<sum2 && sum3<sum4) {
			System.out.println("sum3 is min " + sum3);
		}
		else {
			System.out.println("sum4 is min " + sum4);
		}
		
		
	}
}
