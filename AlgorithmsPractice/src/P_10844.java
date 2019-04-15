import java.io.*;
import java.util.*;

public class P_10844 {
	
	//10844번 쉬운계단수

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[][] d = new long[101][11];
		long sol = 0;
		
		for(int i = 1;i<10;i++) {
			d[1][i] = 1;
		}  
		d[1][0] = 1;

		
		for(int i = 2;i<N+1;i++) { 
			for(int j =0;j<10;j++) {
				if(j==0) {
				 d[i][j] = d[i-1][1]%1000000000;
				}else {
					d[i][j] = (d[i-1][j-1]+d[i-1][j+1])%1000000000;
				}
						
			}
			
		}
		
		for(int i = 1;i<10;i++) {
			sol= (sol+d[N][i])%1000000000;
			
		}
		System.out.println(sol%1000000000);
		
		

	}

}

/*
 * 정답률이 낮았던건..문제가 많이 어려워서가 아니라..
 * 다른이유가 있었던걸 알았다...
 * 그래도 오버플로우 신경써주기!!!
 * 
 * 
 * */

