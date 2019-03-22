import java.util.*;
import java.io.*;
public class P_2875 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int k = Integer.parseInt(input[2]);
		
		int team = 0;
		
		if((n+m)>k) {
			team = n/2<m?n/2:m;
			k-=(m+n)-team*3;
			if(k>0) team-=(k+2)/3;//최소 1명을 제외할때도,최대 3명을 제외할때도 어쨋든 1팀을 빼야하므로 +2를 해준다.
		}
				
		System.out.println(team);
	}
}
