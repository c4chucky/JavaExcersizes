package JavaExercises;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class compareNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
/*		32. Write a Java program to compare two numbers. Go to the editor
		Input Data:
		Input first integer: 25
		Input second integer: 39
		Expected Output

		25 != 39                                                                          
		25 < 39                                                                           
		25 <= 39
*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input first number: ");
		int num1 = input.nextInt();
		System.out.println("Please input second number: ");
		int num2 = input.nextInt();
		String symbol = "";
				
		if (num1 < num2) {
			symbol = " < ";
			System.out.println(num1+symbol+num2);
		} if (num1 > num2) {
			symbol = " > ";
			System.out.println(num1+symbol+num2);
		} if (num1 <= num2) {
			symbol = " <= ";
			System.out.println(num1+symbol+num2);
		} if (num1 >= num2) {
			symbol = " >= ";
			System.out.println(num1+symbol+num2);
		} if (num1 == num2) {
			symbol = " = ";
			System.out.println(num1+symbol+num2);
		} if (num1 != num2) {
			symbol = " != ";
			System.out.println(num1+symbol+num2);
		}
	}
}
		
