import java.util.*;
import java.io.*;
public class P_1744 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		int minus = 0;
		
		for(int i = 0; i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]<=0)
				minus++;
		}
		
		Arrays.sort(arr);
		int sum = 0;
		int idx = -1;
		while(++idx<minus) {
			if(idx+1<minus)
				sum += arr[idx]*arr[++idx];//여기서 아예 idx를 하나더 증가시켜서 음수*양수를 막는다  
			else
				sum += arr[idx];
		}
		
		idx = N;
		
		while(--idx>=minus) {
			if(idx-1>=minus&&arr[idx-1]>1) //1은 제외시켜서 곱해지는게 아니라 더해지도록 해야한다. 
				sum+=arr[idx]*arr[--idx];
			else
				sum+=arr[idx];
		}
		
		
		System.out.println(sum);
	}
}

//여러 조건을 따져야한다
//1.양수*1은 도움이 안된다. 1은 더해지는것이 낫다. 
//2.음수*음수는 양수를 만들어 낸다. 혹은 음수*0은 음수를 없애준다.
//3.양수*양수 또한 그렇다. 