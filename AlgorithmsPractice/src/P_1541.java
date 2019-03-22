import java.io.*;
import java.util.*;
public class P_1541 {
	public static void main(String[] args) throws IOException {
		int a = 0;
		int b = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer m,p;
		String temp="";
		
		for(int i = 0;i<input.length();i++) {
			if(input.charAt(i)=='-') {
				m=new StringTokenizer(input.substring(i+1).replaceAll("[-]|[+]"," "));
				while(m.hasMoreTokens()) b+= Integer.parseInt(m.nextToken());
				break;
			}else
				temp+=input.charAt(i);
		}
		
		p = new StringTokenizer(temp,"+");
		while(p.hasMoreTokens()) a+= Integer.parseInt(p.nextToken());
		
		System.out.println(a-b);
		

		
	}

}
//substring에 대한 나의 착각..^_^..........(기준인덱스포함해서 끝까지다)
//stringTokenizer는 원하는 문자열을 기준으로 잘라서 하나씩 토큰으로 넣을수있다.
//replaceAll과 replace의 차이.......