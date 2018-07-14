package JavaExercises;

public class printFace {

	public static void main(String[] args) {
		/*16. Write a Java program to print a face. Go to the editor
		Expected Output

		 +"""""+                                                 
		[| o o |]                                                
		 |  ^  |                                                 
		 | '-' |                                                 
		 +-----+
*/

		System.out.println(" +\"\"\"\"\"+");
		System.out.println("[| o o |]");
		System.out.println(" |  ^  | ");
		System.out.println(" | '-' | ");
		System.out.println(" +-----+ ");
		System.out.println("\n*******************************\n");
		
		String[] f = new String[5];
		
		f[0] = " +\"\"\"\"\"+";
		f[1] = "[| o o |]";
		f[2] = " |  ^  | ";
		f[3] = " | '-' | ";
		f[4] = " +-----+ ";
		
		for (int i=0;i<5;i++) {
			System.out.println(f[i]);
		}
		
	}

}
