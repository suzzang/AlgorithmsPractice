import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P_10845 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int num= sc.nextInt();

		int back = 0;
		
		for(int i = 0 ; i<num;i++) {
			String input = sc.next();
			
			
			if(input.contains("push")) {
				int n = sc.nextInt();
				back = n;
				q.offer(n);
			}else if(input.equals("pop")) {
				if(q.isEmpty()) {
					System.out.println("-1");
				}else {
				    System.out.println(q.poll());
					
				}
				
			}else if(input.equals("size")) {
				System.out.println(q.size());
			}else if(input.equals("empty")) {
				if(q.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				
				}
			}else if(input.equals("front")) {
                if(q.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(q.peek());
                }
				
			
				
			}else if(input.equals("back")) {
				if(q.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(back);
                }
			}
				
		}
		                 
		
	}

}
//자바에서 queue는 linkedList로 인스턴스화!
// 맨처음 들어간게 back이
