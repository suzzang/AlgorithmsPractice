import java.io.*;
import java.util.*;

public class P_9465Re {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			int N = Integer.parseInt(br.readLine());
			int[][] d = new int[2][N+1];
			
			d[0][0]=0;
			d[0][1]=1;
			
			String[] input1 = new String[N];
			String[] input2 = new String[N];
			
			input1 = br.readLine().split(" ");
			input2 = br.readLine().split(" ");
			
			for(int i = 0; i<N;i++) {
				d[0][i+1] = Integer.parseInt(input1[i]);
				d[1][i+1] = Integer.parseInt(input2[i]);
			}
			
			for(int i = 2;i<=N;i++) {
				d[0][i] = Max(d[1][i-1],d[1][i-2])+d[0][i];
				d[1][i] = Max(d[0][i-1],d[0][i-2])+d[1][i];
			}
			
			System.out.println(Max(d[0][N],d[1][N]));
			
			
		}
		

	}
	
	public static int Max(int a, int b) {return a > b ? a : b;}

}
