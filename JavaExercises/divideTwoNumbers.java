

package JavaExercises;

import java.util.Scanner;

public class divideTwoNumbers {

	public static void main(String[] args) {
		/*
		 * 3. Write a Java program to divide two numbers and print on the screen. Go to the editor
		 *Test Data :
		 *50/3
		 *Expected Output :
		 *16
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Input the number to Divide:");
		long fnum = input.nextInt();
		System.out.println("divided by?");
		long snum = input.nextInt();
		long answer = fnum / snum;
		System.out.println(fnum+"/"+snum+" = "+answer);
		
	}

}
