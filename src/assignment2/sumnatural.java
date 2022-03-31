package assignment2;

import java.util.Scanner;

public class sumnatural {
	int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}

}
