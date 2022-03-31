package assignment2;

import java.util.Scanner;

public class reverse {
	int n;
	public static void main(String[] args) {
		int rem=0,res=0;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n!=0) {
			rem=n%10;
			n=n/10;
			
			res=res*10+rem;
		}
		System.out.println(res);
	}

}
