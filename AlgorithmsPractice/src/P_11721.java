import java.util.ArrayList;
import java.util.Scanner;

public class P_11721 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> ch = new ArrayList<>();
		
		String words = scan.nextLine();
		
		for(int i = 0; i<words.length();i++) {
			ch.add(String.valueOf(words.charAt(i)));
		}
		
		for(int i = 0;i<ch.size();i++) {
			if(i%10==0&&i!=0) {
				System.out.println();
			}
			System.out.print(ch.get(i));
		}
	
	}

}