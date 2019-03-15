import java.util.ArrayList;
import java.util.Scanner;

public class SumOfNums {
	/*
	 * 알고리즘과 입/출력
	 */
	
	//2.숫자의 합 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		
		int sum = 0;
		
		String line = scan.nextLine();
		String wd = scan.nextLine();
		
		for(int i = 0; i< wd.length();i++) {
			nums.add(Character.getNumericValue(wd.charAt(i)));
		}
		
		for(int i = 0; i<Integer.parseInt(line);i++) {
			sum+=nums.get(i);
		}
		System.out.print(sum);
	}
	/*
	 *P: N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
	 *input: 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
	 */
	
	//도대체 첫줄을 왜 입력하는지 모르겠다;;
	//이번에도 그냥 배열리스트 만들어서 마지막으로 한꺼번에 촤라락 더할수있게 했다.
	//여기서 알아가야 할건 String을 char로 바꾸는거하고 char를 int로 바꾸는거?..
	//그리고 Scanner에서 hasNext나 nextLine, next 이런 메소드들 정확히 알아가야 할것같
	

}
