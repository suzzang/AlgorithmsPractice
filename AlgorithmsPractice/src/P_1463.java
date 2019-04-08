import java.util.*;
import java.io.*;
public class P_1463 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int[] d = new int[X+1]; //인덱스 처리를 위해 +1해준다.
		
		d[0]=d[1]= 0;
		
		for(int i =2;i<X+1;i++) {
			d[i] = d[i-1]+1;
			if(i%2==0 && d[i]>d[i/2]+1) d[i] = d[i/2]+1;
			if(i%3==0 && d[i]>d[i/3]+1) d[i] = d[i/3]+1;
		}
		
		System.out.println(d[X]);
		
		

	}

}
/*
 * 아래서 부터 올라가는 방식으로 찾는 
 * DP가 너무너무 어렵구 낮설다,,
 * X값으로 4가 주어졌을때 4가 2로 나누어 떨어지면서 2가되고 다시 X=2가 되었을때를
 * 계산하는 것이므로 같은 행동을 반복하게 된다.
 * 이때 동적프로그래밍에서 그전의 값을 저장해두는 메모라이즈?기법을 사용한다.
 * 그래서 배열안에 집어넣고 비교하면서 최소의 횟수를 구한다.
 * 
 */