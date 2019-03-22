import java.io.*;
import java.util.*;
public class P_11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =Integer.parseInt(br.readLine());

		int[] arr = new int[N+1];
		String[] input = br.readLine().split(" ");
		for(int i = 1; i<=N;i++) {
			
			arr[i] = Integer.parseInt(input[i-1]);
		}
		Arrays.sort(arr);

		int before = 0;
		int count = 0;
		for(int i = 1;i<=N;i++) {

			before+=arr[i];
			count += before;
		}
		System.out.println(count);
		
	}

}
//단순한 오름차순 정렬문제 
//사람의 인덱스도 고려해야 하나 해서 이차원배열을 생각했는데 그게 아니였다!
