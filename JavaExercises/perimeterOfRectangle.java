package JavaExercises;

public class perimeterOfRectangle {

	public static void main(String[] args) {
		/*13. Write a Java program to print the area and perimeter of a rectangle. Go to the editor
		Test Data:
		Width = 5.5 Height = 8.5

		Expected Output
		Area is 5.6 * 8.5 = 47.60
		Perimeter is 2 * (5.6 + 8.5) = 28.20 */

		//Area a = h*w
		double w = 5.6;
		double h = 8.5;
		double a = h*w;
		
		System.out.println("Area is: "+w+" * "+h+" = "+a);
		
		//Perimeter is 2 * (h + w)
		double p = 2*(h+w);
		
		System.out.println("Perimeter is: 2 * ("+w+" + "+h+") = "+p);
		
	}

}
