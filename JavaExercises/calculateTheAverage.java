package JavaExercises;

import java.util.Scanner;

public class calculateTheAverage {

	public static void main(String[] args) {
		
		/*
		 * 12. Write a Java program that takes three numbers as input 
		 * to calculate and print the average of the numbers.
		*/
/*		
		Scanner input = new Scanner(System.in);
		System.out.println("Input 1st number");
		int a = input.nextInt();
		System.out.println("Input 2nd number");
		int b = input.nextInt();
		System.out.println("Input 3rd number");
		int c = input.nextInt();
		double ave = (a+b+c)/3;
		System.out.println("The average of the three numbers is: "+ave);
	}*/

	
		double x = 1;
		double num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the numbers(n) to average: ");
		int n = sc.nextInt();
		while (x <= n) {
			System.out.println("Input number "+x+" : ");
			num += sc.nextInt();
			x += 1;
		}
		
		double avgn = (num/n);
		
		System.out.println("Average: "+avgn);
	}
	
}
