package assignmentday3;

public class frequencyofarray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int arr[]= {1,2,3,4,5,6,5,6,2,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j) {
					if(arr[i]==arr[j]) {
					count++;
					}
				}
			
			}System.out.println("frequency of" + arr[i] + "is" + ++count);
			count=0;
		}

	}

}
