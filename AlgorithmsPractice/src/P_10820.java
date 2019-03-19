import java.util.ArrayList;
import java.util.Scanner;

public class P_10820 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ar = new ArrayList<>();
		int lw=0;
		int up=0;
		int num=0;
		int sp=0;
		ArrayList<String> res = new ArrayList<>();
		
		while(sc.hasNext()) {
			String words = sc.nextLine();
			
			if(words.equals("exit")) {
				break;
				
			}
			ar.add(words);
		}
		
		for (int i = 0;i<ar.size();i++) {
			String r_word = ar.get(i);
			lw=0;
			up=0;
			num=0;
			sp=0;
			for(int j = 0; j<r_word.length();j++) {
				if(Character.isUpperCase(r_word.charAt(j))) {
					up++;
				}else if(Character.isLowerCase(r_word.charAt(j))) {
					lw++;
				}else if(Character.isDigit(r_word.charAt(j))) {
					num++;
				}else if(Character.isSpace(r_word.charAt(j))) {
					sp++;
				}
			}
			
			res.add(lw+" "+up+" "+num+" "+sp);
		}
		
		for(int i = 0; i<res.size();i++) {
			System.out.println(res.get(i));
		}
		

	}

}
// Character클래스 무지좋다...
// 어레이 리스트 짱...
// 여러줄 입력할때 Scanner 클래스의 hasNext중요하다!!
