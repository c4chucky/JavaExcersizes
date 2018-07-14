package JavaExercises;

import java.util.Scanner;

public class swapVariables {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 15. Write a Java program to swap two variables.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input a variable x: ");
		String x = input.next();
		System.out.println("Input variable y: ");
		String y = input.next();
		System.out.println("x: "+x+"| y: "+y);
		String a = x;
		String b = y;
		x = b;
		y = a;
		System.out.println("swapped x: "+x+" swapped y: "+y);

	} 

}
