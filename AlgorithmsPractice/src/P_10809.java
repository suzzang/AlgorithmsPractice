import java.util.Scanner;

public class P_10809 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		int[] arr = new int[26];
		
		for(int i = 0;i<26;i++) {
			arr[i]=-1;
		}
		for(int i = 0; i<S.length();i++) {
			if(arr[S.charAt(i)-'a']!=-1) {
				
			}else {
				arr[S.charAt(i)-'a']=S.indexOf(S.charAt(i));
			}
			
		}
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}	
	}

}
