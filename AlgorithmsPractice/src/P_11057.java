import java.util.*;
import java.io.*;

public class P_11057  {
	static final int MOD = 10007;
	
	static int solution(int length) {
		
		//dp[length][lastNum]
		int[][] dp = new int[1001][10];
		
		//길이가 1인 경우는 다 1개로 초기화
		for (int j = 0; j <= 9;j++) {
			dp[1][j] = 1;
		}
		
		//길이가 2~length인 수를 차례로 계
		for(int len = 2;len <= length ; len ++) {
			//마지막 수는 0~9
			for(int lastNum = 0; lastNum <= 9; lastNum++ ) {
				//앞의 수는 그 전의 수를 더한것이다. 그리고 앞의 수의 lastNum보다 작거나 같다.
				for(int preNum = 0; preNum<=lastNum; preNum++) {
					dp[len][lastNum] += dp[len-1][preNum];
					dp[len][lastNum] %= MOD;
				}
			}
		}
		
		int totalNum = 0;
		
		for(int lastNum = 0; lastNum <= 9 ; lastNum++) {
			totalNum += dp[length][lastNum];
		}
		return totalNum % MOD;
		
	}

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		
		System.out.print(solution(length));
	
		
		

	}

}
