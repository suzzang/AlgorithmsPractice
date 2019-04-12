import java.util.*;
import java.io.*;
public class P_2193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] d = new long[91];
		
		d[0] = 0;
		d[1] = 1;
		d[2] = 1;
		
		
		for(int i = 3;i<N+1;i++) {
			d[i] = d[i-2]+d[i-1];
			
		}
		
		System.out.println(d[N]);

	}

}

/*
 * 피보나치만 알면 금방 풀수있는문제
 * 그런데 왜 정답률이 낮았나했더니
 * 타입형때문에 그런것같다.
 * 테스트케이스를 1개밖에 안줬는데
 * 90을 넣어보니까 음수값이 나와서;; 뭐지 하고
 * long으로 바꿨더니 제대루 잘 나와
 */