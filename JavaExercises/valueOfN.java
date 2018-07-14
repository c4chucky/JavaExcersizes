package JavaExercises;

import java.util.Scanner;

public class valueOfN {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
/*		4. Write a Java program to read the value of an integer m and display 
 * 		the value of n is 1 when m is larger than 0, 0 when m is 0 and -1 when m is less than 0. Go to the editor

		Test Data
		Input a number: 25
		Expected Output :
		The value of m = 25.0
		The value of n = 1
*/
		Scanner input = new Scanner(System.in);
		System.out.println("Please input value of M: ");
		int m = input.nextInt();
		
		int n = 0;
		
		if (m > 0) 
		{
			n = 1;
			System.out.println("The value of N is: "+n);
		}
		if (m == 0) 
		{
			n = 0;
			System.out.println("The value of N is: "+n);
		}
		if (m < 0) 
		{
			n = -1;
			System.out.println("The value of N is: "+n);
		}
		
	}

}
