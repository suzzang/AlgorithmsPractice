import java.util.Scanner;

public class Lec1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		int num;
		int count = 0;
		
		System.out.print("양의 정수를 입력하세요.:");
		num = stdIn.nextInt();
		 do {
			 num/=10;
			 count++;
		 }while(num>0);
		 System.out.println("그 수는 "+count+"자리입니다.");
		
		

	}

}
