package assignmentday3;

import java.util.Scanner;

public class secondlargest {
	public static void main(String[] args) {
		int arr[]= {2,4,5,7,4,6,8,3},temp1=arr[0],temp2=arr[0];
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<arr.length;i++){
			if(temp1<arr[i]) {
				temp1=arr[i];
			}
		}
		for(int i=1;i<arr.length;i++) {
			if(temp2<arr[i] && arr[i]<temp1) {
				temp2=arr[i];
			}
		}
		System.out.println(temp2);
	}
}
