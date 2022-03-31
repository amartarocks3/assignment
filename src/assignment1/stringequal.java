package assignment1;

import java.util.Scanner;

public class stringequal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter string 1");
		String var1 = sc.next();
		System.out.println("Enter string 2");
		String var2 = sc.next();
		if(var1.equals(var2)) {
			System.out.println("Equal string");
		}
		else {
		System.out.println("String Not equal");
		}
		
		
	}
}
