import java.io.*;
import java.util.*;
public class P_11052 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String pNum = br.readLine();
		StringTokenizer st = new StringTokenizer(pNum," ");
		
		int[] P = new int[1001];
		P[0] = 0; //인덱스 1부터 시작하게 하기위함(헷갈릴까봐)
		
		int i = 1;
		while(st.hasMoreTokens()) {
			P[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		int[] d = new int[1001];
		
		for(int m = 1;m<N+1;m++) {
			for(int n = 1; n<=m;n++) {
				d[m] = Math.max(d[m],P[n]+d[m-n]);
			}
		}
		
		System.out.println(d[N]);

	}

}

/*
 * 신나서 점화식 아무렇게나 세웠다가 낭패봤다.....
 * ㅠ...........짜증...........
 * 생각을 하자......
 * 
 */
