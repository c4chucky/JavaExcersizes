package JavaExercises;

public class moreSums {

	public static void main(String[] args) {
		/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
		Test Data:
		Input first number: 125
		Input second number: 24
		Expected Output :
		125 + 24 = 149
		125 - 24 = 101
		125 x 24 = 3000
		125 / 24 = 5
		125 mod 24 = 5*/

		int a = 125;
		int b = 24;
		int sum = a + b;
		int sum1 = a - b;
		int sum2 = a * b;
		int sum3 = a / b;
		int sum4 = a % b;
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println(a+" - "+b+" = "+sum1);
		System.out.println(a+" * "+b+" = "+sum2);
		System.out.println(a+" / "+b+" = "+sum3);
		System.out.println(a+" mod "+b+" = "+sum4);
		
	}

}
