import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P_11004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		
		int K = Integer.parseInt(input[1]);
		String[] num = br.readLine().split(" ");
		
		int[] arr = new int[N];
		
		for(int i = 0; i<N;i++) {
			
			arr[i] = Integer.parseInt(num[i]);
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[K-1]);
		
	}
}
//띠용;; 첨에는 시간초과나오더니 두번째에 다시 성공...?