package assignmentday3;

public class evenposition {
	public static void main(String[] args) {
		
	int arr[] = {1,2,3,4,5,6,5,6,2,2};
	for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
		}
	}

}}
