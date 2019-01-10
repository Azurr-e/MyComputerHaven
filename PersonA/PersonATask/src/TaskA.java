import java.util.Scanner;


public class TaskA {
	
	public static void main( String[] args ) 
	{
		System.out.println( calculateAverage() );
<<<<<<< HEAD
=======
		// Missing e in average
>>>>>>> c7ee0f6097fe0a3d516410575327136d97586d4d
	}		

	public static double calculateAverage()
	{
		System.out.println( "Please enter two integers to be averaged." );
		Scanner scan = new Scanner( System.in );
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
<<<<<<< HEAD
		return val1 + val2 / 2.0;
=======
		return (val1 + val2) / 2.0;
		// o became 0
		// added parentheses around val1 and val2
>>>>>>> c7ee0f6097fe0a3d516410575327136d97586d4d
	}
}
