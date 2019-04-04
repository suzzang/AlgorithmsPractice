import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class P_10824 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		
		String AB = input[0]+input[1];
		String CD = input[2]+input[3];
		
		
		BigInteger AB_i = new BigInteger(AB);
		BigInteger CD_i = new BigInteger(CD);
		
		BigInteger result = AB_i.add(CD_i);
		System.out.println(result);

	}

}
/*
 * 4개 자연수 모두가 1000000 일경우 int 범위 초과 에러가 난다
 * BigInteger 사용하면 끝!
 * 
 * */
