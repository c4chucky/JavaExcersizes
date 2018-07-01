package JavaExercises;

import java.util.Scanner;

public class multiplyTable {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		System.out.println("Choose a number:");
		int factor = input.nextInt();
		for (int i=1;i<=10;i++) {
			int answer = factor * i;
			System.out.println(factor+" x "+i+" = "+answer);
		}

	}

}
