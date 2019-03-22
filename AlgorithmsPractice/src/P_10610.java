import java.io.*;
import java.util.*;
public class P_10610 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int pass = 0;
		int sum = 0;
		int[] num = new int[input.length()];
		for(int i = 0;i<input.length();i++) {
			if(input.charAt(i)=='0') {
				pass=1;
			}
			sum+=Character.getNumericValue(input.charAt(i));
			
			num[i]=Character.getNumericValue(input.charAt(i));
		
		}
		
		if(pass==1&&sum%3==0) {
			Arrays.sort(num);
			for(int i = num.length-1; i>=0;i--) {
				System.out.print(num[i]);
			}
			
		}else {
			System.out.print("-1");
		}
		
		
	}

}
//0이 꼭들어가야하는 조건. 그리고 각 자리수의 합이 3의 배수여야하는것.