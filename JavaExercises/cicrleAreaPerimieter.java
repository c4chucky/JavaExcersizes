package JavaExercises;

public class cicrleAreaPerimieter {

	public static void main(String[] args) {
		/* 11. Write a Java program to print the area and perimeter of a circle. Go to the editor
			Test Data:
			Radius = 7.5
			Expected Output
			Perimeter is = 47.12388980384689
			Area is = 176.71458676442586 */
		
		double pi = 3.14;
		System.out.println("pi = "+Math.PI);
	 	double r = 7.5;
	 	
	 	//Perimeter C = 2 pi r
	 	double c = 2 * Math.PI * r;
	 	System.out.println("The perimeter of the circle is: "+c);
	 	
	 	
	 	//Area = pi(r)2
	 	double square = Math.pow(r, 2);
	 	double a = Math.PI * square;
	 	System.out.println("The Area of the circle is: "+a);
	 	
	}

}
