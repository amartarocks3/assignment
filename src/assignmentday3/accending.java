package assignmentday3;

public class accending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,8,5,5,4,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[j]=arr[i]+arr[j];
					arr[i]=arr[j]-arr[i];
					arr[j]=arr[j]-arr[i];
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
