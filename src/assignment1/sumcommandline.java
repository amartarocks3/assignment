package assignment1;

public class sumcommandline {
	
	public static void main(String[] values) {
	int sum=0;
	for(int i=0;i<values.length;i++) {
		sum += Integer.parseInt(values[i]);
	}
		System.out.println(sum);
		}
}
