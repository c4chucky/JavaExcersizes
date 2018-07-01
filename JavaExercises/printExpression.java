package JavaExercises;

public class printExpression {

	public static void main(String[] args) {
		System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		/*double a = 1;
		double b = 4;
		double c = 4;*/
		int[] intArray = new int[] {3, 5, 7, 9, 11};
		for (int i = 0; i < intArray.length; i++) {
			  System.out.println("Element at index " + i + " : "+ intArray[i]);
	}
		
		//System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		
	}

}
