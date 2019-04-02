import java.util.*;
import java.io.*;

public class P_10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		Stack st = new Stack<String>();
		int sol = 0;
		
		for(int i = 0; i<input.length();i++) {
			if(input.charAt(i)=='(') {
				st.push('(');
			}else if(input.charAt(i)==')') {
				if(input.charAt(i-1)=='(') {
					st.pop();
					sol+=st.size();
				}else {
					st.pop();
					sol+=1;
				}
			}
		}
		
		System.out.println(sol);
	}
	
	

}
