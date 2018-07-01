package JavaExercises;


import java.util.Scanner;

public class addTwoNumbers {

	  @SuppressWarnings("resource")
	public static void main(String[] args) 
	  {
	    Scanner input = new Scanner (System.in);
	    System.out.print("Provide a number to add to: ");
	    int no = input.nextInt();
	    System.out.print("Plus: ");
	    int add = input.nextInt();
	    int answer = no + add;
	    System.out.println();
	    System.out.println(no+" + "+add+" = "+answer);
	  }	
}


