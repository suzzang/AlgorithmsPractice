import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class P_9012 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
//		for(int i = 0;i<num;i++) {
//			String vps=sc.next();
//			int count=0;
//
//			
//			for(int n = 0; n<vps.length();n++) {
//				if(String.valueOf(vps.charAt(n)).equals("(")) {
//					count++;
//				}else {
//					count--;
//				}
//			}
//			if(count==0) {
//				System.out.println("YES");
//			}
//			else {
//				System.out.println("NO");
//			}
//		}
		
		for(int i = 0;i<num;i++) {
			String vps = sc.next();
			Stack<Integer> st = new Stack<>();
			String s = "YES";
			
			for(int n = 0;n<vps.length();n++) {
				if(vps.charAt(n)=='(') {
					st.push(1);
				}else if(vps.charAt(n)==')') {
					if(st.isEmpty()) {
						s="NO";
						break;
					}else {
						st.pop();
					}
				}
	
				
			}
			if(!st.isEmpty()) {
				s="NO";
			}
			System.out.println(s);
		}
	}
}

//스택으로 풀어야 하는 문제인건가?!
//근데 그냥 리스트에넣어서 인덱스로 +/- 하는건 안되는걸까 ㅎ....
//스택쓰면 훨씬 간단해지긴한다...
//char형 비교할때 구냥 작은따옴표써서 비교하는거 까묵지말기...
