import java.util.Scanner;

public class P_10808 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String words = scan.nextLine();
		int[] arr = new int[26];
		
		for(int i = 0 ; i< 26;i++) {
			arr[i]=0;
		}
	
		for(int i = 0 ; i<words.length();i++) {
			
			if(words.charAt(i) == 'a') {
				arr[0]++;
				
			}else if(words.charAt(i) == 'b') {
				arr[1]++;
				
			}else if(words.charAt(i) == 'c') {
				arr[2]++;
				
			}else if(words.charAt(i) == 'd') {
				arr[3]++;
				
			}else if(words.charAt(i) == 'e') {
				arr[4]++;
				
			}else if(words.charAt(i) == 'f') {
				arr[5]++;
				
			}else if(words.charAt(i) == 'g') {
				arr[6]++;
				
			}else if(words.charAt(i) == 'h') {
				arr[7]++;
				
			}else if(words.charAt(i) == 'i') {
				arr[8]++;
				
			}else if(words.charAt(i) == 'j') {
				arr[9]++;
				
			}else if(words.charAt(i) == 'k') {
				arr[10]++;
				
			}else if(words.charAt(i) == 'l') {
				arr[11]++;
				
			}else if(words.charAt(i) == 'm') {
				arr[12]++;
				
			}else if(words.charAt(i) == 'n') {
				arr[13]++;
				
			}else if(words.charAt(i) == 'o') {
				arr[14]++;
				
			}else if(words.charAt(i) == 'p') {
				arr[15]++;
				
			}else if(words.charAt(i) == 'q') {
				arr[16]++;
				
			}else if(words.charAt(i) == 'r') {
				arr[17]++;
				
			}else if(words.charAt(i) == 's') {
				arr[18]++;
			}else if(words.charAt(i) == 't') {
				arr[19]++;
				
			}else if(words.charAt(i) == 'u') {
				arr[20]++;
			}else if(words.charAt(i) == 'v') {
				arr[21]++;
				
			}else if(words.charAt(i) == 'w') {
				arr[22]++;
				
			}else if(words.charAt(i) == 'x') {
				arr[23]++;
				
			}else if(words.charAt(i) == 'y') {
				arr[24]++;
				
			}else if(words.charAt(i) == 'z') {
				arr[25]++;
				
			}
			
		}
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}	
		
	}
}

//효율꽝인 내 코드 ㅎ_ㅎ...
//아스키코드를 이용할줄 몰랐던 나는 저렇게 노가다 코딩을 헀다...
//words.charAt(i)-'a' ++; 를 사용했으면 10줄이면 끝났을 문제..!
//걸린 알파벳이 a일경우 ->아스키코드에 의해 정수97로 표현 , 즉 97-97임으로 a
//arr[0]++; 이게된다.. b이면 98-97 = 1 arr[1]++; 요러케...


