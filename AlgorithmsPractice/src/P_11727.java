import java.io.*;
import java.util.*;
public class P_11727 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] d = new int[1001];
		
		d[0] = 0;
		d[1] = 1;
		d[2] = 3;
		
		for(int i = 3;i<=n;i++) {
			d[i] = d[i-2]*2+d[i-1];
			d[i] %= 10007;
		}
		
		System.out.println(d[n]);
		
		
	}

}
/*
 * 1번을 풀고나니까 확실히 2번은 풀기가 좀더 수월했다.
 * 마찬가지로 그림을 그려서 규칙을 찾고 점화식을 세웠다
 * 문제 풀 때 생각을 하자!!
 */