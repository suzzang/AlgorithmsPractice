import java.io.*;
import java.util.*;

public class P_11656 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] in = new String[input.length()];
		
		
		
		for(int i = 0; i<input.length();i++) {
			in[i] = input.substring(i, input.length());
		}
		Arrays.sort(in);
		
		for(int i = 0; i<in.length;i++) {
			System.out.println(in[i]);
		}

	}

}
/*
 * 자바 substring으로 인덱스 정해서 하나씩 잘라주고
 * 소트 메소드로 사전식으로정렬하면 끝!
 */