import java.util.*;
import java.io.*;

public class P_2156 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N+3];
		int[] d = new int[N+3];
		
		for(int i = 0; i<N;i++) {
			arr[i+3] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 3; i<arr.length;i++) {
			int not = d[i-1];
			int first = d[i-2]+arr[i];
			int second = d[i-3]+arr[i-1]+arr[i];
			
			result = Math.max(not,Math.max(first, second));
			System.out.println("result: "+result);
			System.out.println("not: "+not);
			System.out.println("first: "+first);
			System.out.println("second: "+second);
			d[i] = result;
		}
		System.out.println(result);

	}

}
