package assignmentday3;

public class duplicatelement {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,5,6,2,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j) {
					if(arr[i]==arr[j]) {
						System.out.println(arr[i]);
					}
				}
			
			}
		}
	}
}
	

