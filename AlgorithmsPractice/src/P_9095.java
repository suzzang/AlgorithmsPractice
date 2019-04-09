import java.io.*;
import java.util.*;
public class P_9095 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] n = new int[T];
		int[] d = new int[12];
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 0; i<T;i++) {
			n[i] = Integer.parseInt(br.readLine());
			d[0] = 0;
			d[1] = 1;
			d[2] = 2;
			d[3] = 4;
			
			for(int j = 4;j<=n[i];j++) {
				d[j] = d[j-3]+d[j-2]+d[j-1];
			}
			q.offer(d[n[i]]);
			
		}
		
		for(int i = 0;i<T;i++) {
			System.out.println(q.poll());
		}
		
		

	}

}
/*
 * 마찬가지로 작은 수부터 경우의 수를 구해 규칙을 구했고
 * 점화식을 세워서 풀이했다.
 * 그런데 이문제같은 경우 작은수는 경우의 수를 빠르게 구할수 있어서
 * 나는 3까지 미리 초기화를 해주었다.
 * 이렇게 푸는게 맞는지 모르겠지만,,,
 * 다른 풀이도 한번 봐야겠다.
 * 
 * */

