package assignmentday3;

public class largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,5,6,2,2};
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
		}
		System.out.println(temp);
	}

}
