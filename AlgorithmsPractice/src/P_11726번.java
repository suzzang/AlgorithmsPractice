import java.io.*;
import java.util.*;
public class P_11726번 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] d = new int[1001];
		d[0] = 0;
		d[1] = 1; 
		d[2] = 2;
		
		
		for(int i = 3;i<=n;i++) {
			d[i] = d[i-2]+d[i-1];
			d[i] %= 10007;
		}
	
		
		System.out.println(d[n]);

	}

}
/*
 * 동적프로그래밍은 점화식을 세우는게 가장 중요한것같다
 * 도형같은경우 직접 그림을 그려서 규칙을 찾아보려구 하자!!!! 
 *
 */