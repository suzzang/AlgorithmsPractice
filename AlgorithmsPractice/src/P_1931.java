import java.io.*;
import java.util.Arrays;
import java.util.Comparator;


public class P_1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] I = new int[N][2];
		
		for(int i = 0;i<N;i++) {
			String[] input = br.readLine().split(" ");
			I[i][0]=Integer.parseInt(input[0]);
			I[i][1]=Integer.parseInt(input[1]);
		}
		Arrays.sort(I, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]==o2[1]) {
					return Integer.compare(o1[0],o2[0]);
				}
				return Integer.compare(o1[1],o2[1]);
			}
			
		});
		
		int count = 0;
		int end = -1;
		
		//이부분이 관건!
		
		for(int i = 0;i<N;i++) {
			//System.out.println(I[i][0]+" "+I[i][1]);
			
			if(I[i][0]>=end) {
				end = I[i][1];
				count++;
			}
		}
		System.out.println(count);
		
	}
}
//이차원배열정렬은 생각했었는데...밑에 부분처럼 포문돌려서 비교하는게 아직 어렵다 ㅠ..