import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmBase {
	/*
	 * 알고리즘과 입/출력
	 */
	
	//1.그대로 출력하기
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
		
		/*
		 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 
		 * 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
		 *  각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 
		 *  또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
		 */
		
		// 입력받은 그대로 출력 -> 즉 한번에 출력을 해야한다.
		// 따라서 빈 배열리스트를 하나 만들어서 단어를 타이핑 하는 족족
		// add를 해준다음에 단어가 들어가있는 배열을 출력한다.
		// 그런데 어떻게 입력을 끝내는지는 나와있지않아서 위의 입력조건에 벗어나면
		// 종료를 시키거나 임의로 exit을 입력했을때 종료하도록 했다. 
	}

}
