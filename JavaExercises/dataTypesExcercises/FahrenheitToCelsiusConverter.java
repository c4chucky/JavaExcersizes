package dataTypesExcercises;

import java.util.Scanner;

public class FahrenheitToCelsiusConverter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			/*
			1. Write a Java program to convert temperature from Fahrenheit to Celsius degree. Go to the editor
			Test Data
			Input a degree in Fahrenheit: 212
			Expected Output:
			212.0 degree Fahrenheit is equal to 100.0 in Celsius
			 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please input degrees in Fahrneheit to convert to Celsius: ");
		double f = input.nextDouble();		
		double c = (f-32)*0.5556;
		System.out.println(f+" degree Fahrenheit is equal to "+c+" in in Celsius.");
		
	}

}
