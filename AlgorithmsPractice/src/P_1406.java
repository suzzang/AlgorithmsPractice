import java.util.*;
import java.io.*;

public class P_1406 {
	//스택 2개로 구현해보기 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<String> st1 = new Stack<String>();
		Stack<String> st2 = new Stack<String>();
		for(int i = 0 ;i<input.length();i++) {
			st1.push(String.valueOf(input.charAt(i)));
		}
		
		int num = Integer.parseInt(br.readLine());
		String[] order_r = new String[2];
		for(int i = 0; i<num;i++) {
			String order = br.readLine();
			
			if(order.contains(" ")) {
				order_r = order.split(" ");
			
			}
			
			if(order.equals("L")) {
				if(st1.isEmpty()) {
					
				}else {
					String str = st1.pop();
					st2.push(str);
				}
	
			}else if(order.equals("D")) {
				if(st2.isEmpty()) {
					
				}else {
					String str = st2.pop();
					st1.push(str);
				}
				
			}else if(order.equals("B")) {
				if(st1.isEmpty()) {
					
				}else {
					st1.pop();
					
				}
				
			}else if(order_r[0].equals("P")) {
				st1.push(order_r[1]);
				
			}
		}
		for (int i = st2.size()-1;i>=0;i--) {
			st1.push(st2.get(i));
		}
		for (int i = 0;i<st1.size();i++) {
			System.out.print(st1.get(i));
		}

		
		
//		System.out.print(st2.pop());
	}
}
