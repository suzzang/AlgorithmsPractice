import java.util.Scanner;
import java.util.Stack;


public class P_10828 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		String input;
		
		for(int i = 0; i< n;i++) {
			input = scan.next();
			if(input.contains("push")) {
				stack.push(scan.nextInt());
			}else if(input.equals("pop")) {
				if(stack.isEmpty()) {
					System.out.println("-1");
				}else {
					stack.pop();
				}
			}else if (input.equals("size")) {
				System.out.println(stack.size());
			}else if(input.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(input.equals("top")) {
				if(stack.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(stack.peek());
				}
			}
		}
	
		
	}
	
	//똑같은 코든데 왜 자꾸 틀렸다하는지 모르겠음^^...짜증난당
	//스택관련 문제는 자바로 푸는게 훨 나은듯!!

}
