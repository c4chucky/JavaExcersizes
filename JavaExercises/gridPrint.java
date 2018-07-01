package JavaExercises;

public class gridPrint {

	public static void main(String[] args) {
		String word = "JAVA";
		String[] wordSplit = word.split("");
		for (int i=0;i<wordSplit.length;i++) {
			System.out.println(wordSplit[i]);
				for (int j=0;j<wordSplit.length;j++) {
					//System.out.println(wordSplit[i]);
					System.out.println(wordSplit[j]);
				}
				
		}
	}

}
