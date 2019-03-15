import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmBase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();
		
		while (scan.hasNext()) {
			String word = scan.nextLine();
			if(word.startsWith(" ")||word.endsWith(" ")||word.isEmpty()||word.length()>100) {
				break;
			}
			if(word.equals("exit")) {
				break;
			}
			words.add(word);
			
			
		}
		scan.close();
		
		for(int i = 0 ; i< words.size();i++) {
			System.out.println(words.get(i));
		}
	}

}
