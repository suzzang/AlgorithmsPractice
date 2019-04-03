import java.io.*;
import java.util.*;
public class P_10866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine()); 
		
		Deque d = new LinkedList<Integer>();
		Object result = 0;
		for(int i = 0; i<N;i++) {
			String input = br.readLine();
			String[] input2 = new String[2];
			if(input.contains(" "))
				input2 = input.split(" ");
			
			if(input.equals("front")) {
				if(d.isEmpty()) {
					result = -1;
				}else {
					result = d.peekFirst();
				}
				System.out.println(result);
				
			}else if(input.equals("back")) {
				if(d.isEmpty()) {
					result = -1;
				}else {
					result = d.peekLast();
				}
				System.out.println(result);
				
			}else if(input.equals("size")) {
				result = d.size();
				System.out.println(result);
				
			}else if(input.equals("empty")) {
				if(d.isEmpty()) {
					result = 1;
				}else {
					result = 0;
				}
				System.out.println(result);
				
			}else if(input.equals("pop_front")) {
				if(d.isEmpty()) {
					result = -1;
				}else {
					result = d.pollFirst();
				}
				System.out.println(result);
				
			}else if(input.equals("pop_back")) {
				if(d.isEmpty()) {
					result = -1;
				}else {
					result = d.pollLast();
				}
				System.out.println(result);
				
			}else if(input2[0].equals("push_front")) {
				d.offerFirst(Integer.parseInt(input2[1]));
				
				
			}else if(input2[0].equals("push_back")) {
				d.offerLast(Integer.parseInt(input2[1]));
				
				
			}
		}

	}

}
