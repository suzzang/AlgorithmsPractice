import java.io.*;
import java.util.*;
public class P_1158_r {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = new String[2];
		input = br.readLine().split(" ");
		
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		int size = 0;
		int size_o = 0;
		int flag = 0;
		Queue ql = new LinkedList();
		Queue ql2 = new LinkedList();
		Queue sol = new LinkedList();

		
		for(int i = 0; i<N;i++) {
			ql.offer(i+1);
		}
		size_o = ql.size();

		while(true) {
			
				for(int i = 0; i<K;i++) {
					
					if(i==K-1) {
						
						sol.offer(ql.poll());//k번
					}else {
						if(size_o<K) {
							ql.offer(ql.peek());
							flag = 1;
						}
						ql2.offer(ql.poll());
						
					}
					
				}
				size = ql2.size();
				if(flag == 1) {
					ql2 = new LinkedList();
				}else {
					for(int j = 0; j<size;j++) {
						Object q = ql2.poll();
						
						ql.offer(q);	
					}
				}
				
				size_o = ql.size();
			
			
			if(sol.size()==N) {
				
				break;
			}
	
		}
		
		for(int i = 0;i<N;i++) {
			if(i==0) {
				if(N==1) {
					System.out.print("<"+sol.poll()+">");
				}else {
					System.out.print("<"+sol.poll()+",");
				}
			}else if(i==N-1) {
				System.out.print(" "+sol.poll()+">");
			}else {
				System.out.print(" "+sol.poll()+",");
			}
			
			
		}


	}

}
