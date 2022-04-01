package assignment1;

public class sumcommandline {
	
	public static void main(String args[]) {
	int sum=0;
		int x = Integer.parseInt(args[0]);
		int y =	Integer.parseInt(args[1]);
		sum = x+y;
		System.out.println(sum);
		}
}
