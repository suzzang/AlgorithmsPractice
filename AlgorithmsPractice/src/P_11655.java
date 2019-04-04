import java.io.*;
import java.util.*;

public class P_11655 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		String[] sol = new String[input.length];
		
		for(int i = 0; i<input.length;i++) {
			String str = input[i];
			sol[i] = ROT13(str);			
		}
		
		for(int i = 0; i<sol.length;i++) {
			if(i==sol.length-1) {
				System.out.print(sol[i]);
			}else {
				System.out.print(sol[i]+" ");
			}
			
		}

	}
	
	public static String ROT13(String s) {
		String sol = "";
		 for(int i = 0; i<s.length();i++) {
			 char ch = s.charAt(i);
			 if(Character.isDigit(ch)) {
				
			 }else {
				 int trans = (int)ch +13;
				
				 if(Character.isUpperCase(ch)) {
					 if(trans>90) {
						 trans-=26;
					 }
				 }else {
					 if(trans>122) {
						 trans-=26;
					 }
				 }
				 ch = (char)trans;
			 }
			 sol+=ch;
		 }
		 return sol;
	}

}

/*
 * 이번에는 함수로 묶어서 작성했다. 
 * 어떻게 하면 효율적일지 생각하다가 아스키코드를 썼는데,(근데 내 코드는 썩 효율적이진 않은듯..)
 * 범위가 넘어갔을때의 경우를 신경써야해서 조금 번거로웠는데
 * 그래도 쉽게 풀수있었다!
 * A:65 a:97 알아두자!!
 * */
