import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class P_10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr= new int[N];
		
		for(int i = 0 ; i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		Arrays.sort(arr);
//		for(int i = 0; i<N;i++) {
//			System.out.println(arr[i]);
//		}
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i<N;i++) {
			sb.append(arr[i]+"\n");
		}

		System.out.println(sb);
		
	}
}
