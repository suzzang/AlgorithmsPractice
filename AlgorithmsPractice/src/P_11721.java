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
	//이것도 배열리스를 이용해서 풀었다. 다른 작은 조건들은 생각안했는데,
	//다른 분들이 푼것들을 보니까 크게 다른 부분은 없었다..
	//이문제에서 주의할것은 i가 0일때에도 10으로 나눈 나머지가 0인걸 고려해서
	//이때는 제외시켜야 한다. 

}