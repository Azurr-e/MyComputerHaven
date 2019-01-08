import java.util.Scanner;


public class TaskA {
	
	public static void main(String[] args) 
	{
		System.out.println( calculateAverage() );
	}		

	public static double calculateAverage()
	{
		System.out.println( "Please enter two integers to be averaged." );
		Scanner scan = new Scanner(System.in);
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
		return (val1 + val2) / 2.0;
	}
}
