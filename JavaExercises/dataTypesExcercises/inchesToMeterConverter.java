package dataTypesExcercises;

import java.util.Scanner;

public class inchesToMeterConverter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
/*		2. Write a Java program that reads a number in inches, converts it to meters. Go to the editor
		Note: One inch is 0.0254 meter.
		Test Data
		Input a value for inch: 1000
		Expected Output :
		1000.0 inch is 25.4 meters
*/
		Scanner input = new Scanner(System.in);
		System.out.println("Please input an amount in Inches to convert to Meters: ");
		double inch = input.nextDouble();
		double meters = inch * 0.0254;
		System.out.println(inch+" inch is "+meters+" in Meters.");
		
	}

}
