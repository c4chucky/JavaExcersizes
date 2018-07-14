package JavaExercises;

import java.util.function.BinaryOperator;

public class addBinaryNums {

	public static void main(String[] args) {
/*		17. Write a Java program to add two binary numbers. Go to the editor
		Input Data:
		Input first binary number: 10
		Input second binary number: 11
		Expected Output

		Sum of two binary numbers: 101
*/
		String input0 = "10";
		String input1 = "11";
		
		int number0 = Integer.parseInt(input0,2);
		int number1 = Integer.parseInt(input1,2);
		
		int sum = number0 + number1;
		System.out.println(Integer.toBinaryString(sum));
		
	}

}
