import java.io.*;
import java.io.InputStreamReader;

public class P_11047 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int K = Integer.parseInt(input[1]);
		int[] coin = new int[N];
		int count=0;
		
		for(int i = 0;i<N;i++) {
			coin[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i = N-1 ; i>=0;i--) {
			count+=K/coin[i];
			K=K%coin[i];
		}
		
		System.out.println(count);

	
	}

}
//나누기를 잘 응용!!!!!!!